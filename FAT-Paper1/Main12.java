class Cinema {
    private int availableSeats;

    public Cinema(int seats) {
        this.availableSeats = seats;
    }

    // Synchronized method to book tickets
    public synchronized void bookTickets(String userName, int tickets) {
        System.out.println(userName + " attempting to book " + tickets + " ticket(s).");
        if (tickets <= availableSeats) {
            try {
                // Simulate some delay for booking process
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availableSeats -= tickets;
            int totalPrice = tickets * 200;
            System.out.println(userName + " successfully booked " + tickets + " ticket(s). Total price: Rs." + totalPrice);
        } else {
            System.out.println(userName + ": Not enough tickets available.");
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}

class UserThread extends Thread {
    private Cinema cinema;
    private String userName;
    private int ticketsToBook;

    public UserThread(Cinema cinema, String userName, int ticketsToBook) {
        this.cinema = cinema;
        this.userName = userName;
        this.ticketsToBook = ticketsToBook;
    }

    @Override
    public void run() {
        cinema.bookTickets(userName, ticketsToBook);
    }
}

public class Main12 {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(10);  // 10 seats available

        // Create multiple user threads attempting to book tickets concurrently
        UserThread user1 = new UserThread(cinema, "User1", 3);
        UserThread user2 = new UserThread(cinema, "User2", 4);
        UserThread user3 = new UserThread(cinema, "User3", 5);
        UserThread user4 = new UserThread(cinema, "User4", 2);

        user1.start();
        user2.start();
        user3.start();
        user4.start();

        // Wait for all threads to finish
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final available tickets: " + cinema.getAvailableSeats());
    }
}
