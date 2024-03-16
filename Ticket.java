import javax.xml.namespace.QName;
import java.io.FileWriter;
import java.io.IOException;

public class Ticket {
    
        private String row;
        private int seat;
        private int price;
        private Person person;

        public Ticket(String row, int seat, int price, Person person) {
            this.row = row;
            this.seat = seat;
            this.price = price;
            this.person = person;
        }
        public String getRow() {
            return row;
        }

        public int getSeat() {
            return seat;
        }

        public int getPrice() {
            return price;
        }
        public Person getPerson() {
            return person;
        }

        public void setRow(String row) {
            this.row = row;
        }

        public void setSeat(int seat) {
            this.seat = seat;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        public void info(){
            System.out.println();
            System.out.println("Ticket info \nRow: "+row+" \nSeat no: "+seat+" \nPrice : "+price);
            System.out.println();
            person.personinfo();
            System.out.println();

    }
    public void save_file(){

        try {
            FileWriter object =new FileWriter(row+seat+".txt");
            object.write("Name: "+person.getName()+"\n");
            object.write("Surname: "+person.getSurname()+"\n");
            object.write("Email: "+person.getEmail()+"\n");
            object.write("Row: "+row+"\n");
            object.write("Seat: "+seat+"\n");
            object.write("Price: "+price+"\n");
            object.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
