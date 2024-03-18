import java.util.Objects;
import java.util.Scanner;

public class PlaneManagement {
 static int count=0;
 static Ticket [] tickets=new Ticket[52];
    static int[][] seat_management_system = new int[4][];
    static Scanner read_input = new Scanner(System.in);

    public static Person get_user_info(){
        /* This Method get input from user and store it
        those inputs are stored in Person class in a constructor
        @return name,surname,email
         */

            System.out.print("Enter your name:");
        String name = null;
        try {
            name = read_input.nextLine();
        } catch (Exception e) {
            System.out.println("Enter a valid name");
        }

        System.out.print("Enter your surname:");
        String surname = null;
        try {
            surname = read_input.nextLine();
        } catch (Exception e) {
            System.out.println("Enter a valid surname");
        }

        System.out.print("Enter your email:");
        String email = null;
        try {
            email = read_input.nextLine();
        } catch (Exception e) {
            System.out.println("Enter a valid email");
        }
        return new Person(name,surname,email);
    }


    public static int seat_price( int  user_input_seat_no){
        /*
         This Method return seat price with corresponding if-else condition
         @params user input seat number
         @return seat price
         */
        if(user_input_seat_no<=5){
            return 200;
        }
        else if(user_input_seat_no>=6 && user_input_seat_no<=9){
            return 150;
        }
        else if(user_input_seat_no>=10 && user_input_seat_no<=14){
           return  180;
        }
        return 0;
    }
    public static void buy_seat() {
        /*
        This method verify a seat is available or not and buy if its not sold and increase count per each selling and pass  the parameters of perosn and store it in a text file.
        @params  person information
        @return person information
        */
        Scanner read_input = new Scanner(System.in);
        System.out.print("\nEnter a Row Letter: ");

        String user_input_row_letter = null;
        try {
            user_input_row_letter = read_input.nextLine().toUpperCase();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        switch (user_input_row_letter) {

            case "A":

                System.out.print("Enter a Seat No:");
                int user_input_seat_no = 0;
                try {
                    user_input_seat_no = read_input.nextInt();


                    if (user_input_seat_no > 0 && user_input_seat_no < 15) {
                        if (seat_management_system[0][user_input_seat_no - 1] == 0) {
                            seat_management_system[0][user_input_seat_no - 1] = 1;

                           int Ticket_price= seat_price(user_input_seat_no);
                           Person customer=get_user_info();
                           Ticket ticket=new Ticket(user_input_row_letter, user_input_seat_no,Ticket_price,customer);
                           tickets[count]=ticket;
                           count+=1;
                            System.out.println();
                            System.out.println("You booked your seat successfully\nThank you for choosing our airline.Have a pleasant flight!");
                            ticket.save_file();


                        }else{
                            System.out.println("Sorry dear customer! \nThis seat has been previously reserved ");
                        }

                    } else {
                        System.out.println("Invaild seat number");

                    }
                } catch (Exception e) {
                    System.out.println("Enter a valid seat no");
                }
                System.out.println();
                break;

            case "B":

                System.out.print("Enter the seat number:");
                try {
                    user_input_seat_no = read_input.nextInt();
                    if (user_input_seat_no > 0 && user_input_seat_no < 13) {
                        if (seat_management_system[1][user_input_seat_no - 1] == 0) {
                            seat_management_system[1][user_input_seat_no - 1] = 1;

                            int Ticket_price= seat_price(user_input_seat_no);
                            Person customer=get_user_info();
                            Ticket ticket=new Ticket(user_input_row_letter, user_input_seat_no,Ticket_price,customer);
                            tickets[count]=ticket;
                            count+=1;
                            System.out.println();
                            System.out.println("You booked your seat successfully\nThank you for choosing our airline.Have a pleasant flight! ");
                            ticket.save_file();

                        } else{
                            System.out.println("Sorry dear customer!\nThis seat has been previously reserved ");
                        }
                    } else {
                        System.out.println("Invaild seat number");
                    }
                } catch (Exception e) {
                    System.out.println("Enter a valid seat no");
                }
                System.out.println();
                break;

            case "C":

                System.out.print("Enter the seat number:");
                try {
                    user_input_seat_no = read_input.nextInt();
                    if (user_input_seat_no > 0 && user_input_seat_no < 13) {
                        if (seat_management_system[2][user_input_seat_no - 1] == 0) {
                            seat_management_system[2][user_input_seat_no - 1] = 1;

                            int Ticket_price= seat_price(user_input_seat_no);
                            Person customer=get_user_info();
                            Ticket ticket=new Ticket(user_input_row_letter, user_input_seat_no,Ticket_price,customer);
                            tickets[count]=ticket;
                            count+=1;
                            System.out.println("\nYou booked your seat successfully\nThank you for choosing our airline.Have a pleasant flight! ");
                            ticket.save_file();


                        }else{
                            System.out.println("\nSorry dear customer!\nThis seat has been previously reserved ");
                        }
                    } else {
                        System.out.println("Invaild seat number");
                    }
                } catch (Exception e) {
                    System.out.println("Enter a valid seat no");
                }
                System.out.println();
                break;

            case "D":

                System.out.print("Enter the seat number:");
                try {
                    user_input_seat_no = read_input.nextInt();
                    if (user_input_seat_no > 0 && user_input_seat_no < 15) {
                        if (seat_management_system[3][user_input_seat_no - 1] == 0) {
                            seat_management_system[3][user_input_seat_no - 1] = 1;

                            int Ticket_price= seat_price(user_input_seat_no);
                            Person customer=get_user_info();
                            Ticket ticket=new Ticket(user_input_row_letter, user_input_seat_no,Ticket_price,customer);
                            tickets[count]=ticket;
                            count+=1;
                            System.out.println();
                            System.out.println("You booked your seat successfully\nThank you for choosing our airline.Have a pleasant flight! ");
                            ticket.save_file();


                        }else{
                            System.out.println("Sorry dear customer! \nThis seat has been previously reserved ");
                        }
                    } else {
                        System.out.println("Invaild seat number");

                    }
                } catch (Exception e) {
                    System.out.println("Enter a valid seat no");
                }
                System.out.println();
                break;

            default:
                System.out.println("\nInvaild row letter\n");

                break;

        }
    }

    public static void cancel_seat() {

        Scanner readinput = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter row: ");

        String user_input_row_letter = null;
        try {
            user_input_row_letter = readinput.nextLine().toUpperCase();
        } catch (Exception e) {
            System.out.println("Enter a valid row letter");;
        }

        switch (user_input_row_letter) {
            case "A":

                System.out.print("Enter seat no: ");
                int user_input_seat_no = 0;
                try {
                    user_input_seat_no = readinput.nextInt();
                } catch (Exception e) {
                    System.out.println("Enter a valid seat no!");;
                }
                if (user_input_seat_no > 0 && user_input_seat_no < 15) {
                    if (seat_management_system[0][user_input_seat_no - 1] == 1) {
                        seat_management_system[0][user_input_seat_no - 1] = 0;

                        boolean state=false;
                        for(int i =0;i<count;i++){
                            //what the below line says is this a constructor ah?
                            Ticket data = tickets[i];

                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                data.delete_ticket_file();
                                for (int a=i;a<count-1;a++){
                                    tickets[a]=tickets[a+1];
                                }
                                tickets[count-1]=null;
                                count--;

                                state=true;

                            }
                            if(state){
                                break;
                            }
                        }
                        if(!state){
                            System.out.println("No data found in that seat");
                        }


                        System.out.println("You have cancel your seat successfully");
                    }
                } else {
                    System.out.println("Invalid seat number");
                }
                System.out.println();
                break;

            case "B":

                System.out.print("Enter the seat number:");
                user_input_seat_no = readinput.nextInt();
                if (user_input_seat_no > 0 && user_input_seat_no < 13) {
                    if (seat_management_system[1][user_input_seat_no - 1] == 1) {
                        seat_management_system[1][user_input_seat_no - 1] = 0;



                        boolean state=false;
                        for(int i =0;i<count;i++){
                            Ticket data = tickets[i];
                            data.delete_ticket_file();
                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                 data.delete_ticket_file();
                                for (int a=i;a<count-1;a++){
                                    tickets[a]=tickets[a+1];
                                }
                                tickets[count-1]=null;
                                count--;

                                state=true;

                            }
                            if(state){
                                break;
                            }
                        }
                        if(!state){
                            System.out.println("No data found in that seat");
                        }


                        System.out.println("You have cancel your seat successfully");
                    }
                } else {
                    System.out.println("Invalid seat number");
                }
                System.out.println();
                break;

            case "C":

                System.out.print("Enter the seat number:");
                user_input_seat_no = readinput.nextInt();
                if (user_input_seat_no > 0 && user_input_seat_no < 13) {
                    if (seat_management_system[2][user_input_seat_no - 1] == 1) {
                        seat_management_system[2][user_input_seat_no - 1] = 0;


                        boolean state=false;
                        for(int i =0;i<count;i++){
                            Ticket data = tickets[i];
                            data.delete_ticket_file();
                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                data.delete_ticket_file();
                                for (int a=i;a<count-1;a++){
                                    tickets[a]=tickets[a+1];
                                }
                                tickets[count-1]=null;
                                count--;

                                state=true;

                            }
                            if(state){
                                break;
                            }
                        }
                        if(!state){
                            System.out.println("No data found in that seat");
                        }


                        System.out.println("You have cancel your seat successfully");


                    }
                } else {
                    System.out.println("Invalid seat number");
                }
                System.out.println();
                break;

            case "D":

                System.out.print("Enter the seat number:");
                user_input_seat_no = readinput.nextInt();
                if (user_input_seat_no > 0 && user_input_seat_no < 15) {
                    if (seat_management_system[3][user_input_seat_no - 1] == 1) {
                        seat_management_system[3][user_input_seat_no - 1] = 0;


                        boolean state=false;
                        for(int i =0;i<count;i++){
                            Ticket data = tickets[i];
                            data.delete_ticket_file();
                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                data.delete_ticket_file();
                                for (int a=i;a<count-1;a++){
                                    tickets[a]=tickets[a+1];
                                }
                                tickets[count-1]=null;
                                count--;

                                state=true;

                            }
                            if(state){
                                break;
                            }
                        }
                        if(!state){
                            System.out.println("No data found in that seat");
                        }

                        System.out.println("You have cancel your seat successfully");
                    }
                } else {
                    System.out.println("Invalid seat number");
                }
                System.out.println();
                break;

            default:
                System.out.println("Invalid row letter");
                System.out.println();
                break;

        }
    }

    public static void find_first_available_seat() {
        boolean state = false;
        for (int i = 0; i < seat_management_system.length; i++) {
            for (int j = 0; j < seat_management_system[i].length; j++) {
                if (seat_management_system[i][j] == 0) {
                    switch (i) {
                        case 0:
                            System.out.println("A seat is available in Row A " + (j + 1));
                            state = true;
                            break;

                        case 1:
                            System.out.println("A seat is available in Row B " + (j + 1));
                            state = true;
                            break;

                        case 2:
                            System.out.println("A seat is available in Row C " + (j + 1));
                            state = true;
                            break;
                        case 3:
                            System.out.println("A seat is available in Row D " + (j + 1));
                            state = true;
                            break;
                        default:
                            break;
                    }
                    break;

                }
            }
            if (state) {
                break;
            }
        }
    }
    public static void show_seating_plan() {

        for (int i = 0; i < seat_management_system.length; i++) {

                    for (int j = 0; j < seat_management_system[i].length; j++) {

                        if (i == 2) {
                            System.out.println();
                        }
                        if (seat_management_system[i][j] == 1) {
                            System.out.print("X ");
                        } else {
                            System.out.print("O ");
                        }
                    }
                    System.out.println();
        }
    }
    public static void ticket_info() {
        /*This method prints each person ticket information
        @params do not pass any parameters.
        @return not return anything
        */

        if (count != 0) {
            int total_sales_amount = 0;
            for (int i = 0; i < count; i++) {
                // how do we create this line
                Ticket obj = tickets[i];
                System.out.print((i+1)+")");
                obj.info();

                total_sales_amount += obj.getPrice();

            }
            System.out.println("The total tickets sold today is: "+count );
            System.out.println("\nThe total sales of the day is:- £" + total_sales_amount);
        } else {
            System.out.println("""
                    No tickets purchased
                    Total sales of the day is £ 0""");
        }
    }
    public static void search_info(){
        Scanner readinput = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter row: ");
        String user_input_row_letter = null;
        int user_input_seat_no = 0;

        try {
            user_input_row_letter = readinput.nextLine().toUpperCase();


            switch (user_input_row_letter){
                case "A":
                    System.out.print("Enter the seat number: ");
                    user_input_seat_no = readinput.nextInt();
                    if (user_input_seat_no > 0 && user_input_seat_no < 15) {
                        boolean state=true;
                        for(int i =0;i<count;i++){
                            //eanaku puriyalaaa................
                            Ticket data = tickets[i];
                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                data.info();
                                state=false;

                            }
                            if(!state){
                                break;
                            }
                        }
                        if(state){
                            System.out.println("Seat is available");
                        }
                    }else {
                        System.out.println("Enter a valid seat no");
                    }

                    break;
                case "B":
                    System.out.print("Enter the seat number: ");
                    user_input_seat_no = readinput.nextInt();
                    if (user_input_seat_no > 0 && user_input_seat_no < 13) {
                        boolean state=true;
                        for(int i =0;i<count;i++){
                            //eanaku puriyalaaa................
                            Ticket data = tickets[i];
                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                data.info();
                                state=false;

                            }
                            if(!state){
                                break;
                            }
                        }
                        if(state){
                            System.out.println("Seat is available");
                        }
                    }else {
                        System.out.println("Enter a valid seat no");
                    }

                    break;
                case "C":
                    System.out.print("Enter the seat number: ");
                    user_input_seat_no = readinput.nextInt();
                    if (user_input_seat_no > 0 && user_input_seat_no < 13) {
                        boolean state=true;
                        for(int i =0;i<count;i++){
                            //eanaku puriyalaaa................
                            Ticket data = tickets[i];
                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                data.info();
                                state=false;

                            }
                            if(!state){
                                break;
                            }
                        }
                        if(state){
                            System.out.println("Seat is available");
                        }
                    }else {
                        System.out.println("Enter a valid seat no");
                    }

                    break;

                case "D":
                    System.out.print("Enter the seat number: ");
                    user_input_seat_no = readinput.nextInt();
                    if (user_input_seat_no > 0 && user_input_seat_no < 15) {
                        boolean state=true;
                        for(int i =0;i<count;i++){
                            //eanaku puriyalaaa................
                            Ticket data = tickets[i];
                            String row_no = data.getRow();
                            int seat_no = data.getSeat();
                            if (Objects.equals(row_no, user_input_row_letter) && seat_no == user_input_seat_no) {
                                data.info();
                                state=false;

                            }
                            if(!state){
                                break;
                            }
                        }
                        if(state){
                            System.out.println("Seat is available");
                        }
                    }else {
                        System.out.println("Enter a valid seat no");
                    }
                    break;

                default:
                    System.out.println("Enter Valid Row Letter");
                    break;

            }

        } catch (Exception e) {
            System.out.println("Enter a valid input!");;
        }
    }

    public static void user_menu(){
        int user_input=7;
        do {
            user_input=7;
            System.out.println("""
                         **************************************************
    
                         *                 MENU OPTIONS                   *
    
                         **************************************************
    
                              1)Buy a seat
    
                              2)Cancel a seat
    
                              3)Find first available seat
    
                              4)Show seating plan
    
                              5)Print tickets information and total sales
    
                              6)Search ticket
    
                              0)Quit
    
                        **************************************************
  
                                                                           """);
            Scanner readinput=new Scanner(System.in);

            System.out.print("Please select an option:");
            try {
                user_input = readinput.nextInt();
                switch (user_input) {
                    case 1:
                        buy_seat();
                        break;
                    case 2:
                        cancel_seat();
                        break;
                    case 3:
                        find_first_available_seat();
                        break;
                    case 4:
                        show_seating_plan();
                        break;
                    case 5:
                        System.out.println();
                        ticket_info();
                        break;
                    case 6:
                        search_info();
                        break;
                    case 0:
                        System.out.println("\nThank you for choosing our airline.\n");
                        break;
                    default:
                        System.out.println("\nChoose a option between 0-6\n");
                        break;
                }
            } catch (Exception e) {
                System.out.println("\nEnter  a valid input\n ");
            }

        } while (user_input != 0  );
    }



    public static void main(String[] args) {

        System.out.println("\nWelcome to the Plane Management application\n");

        seat_management_system[0] = new int[14];
        seat_management_system[1] = new int[12];
        seat_management_system[2] = new int[12];
        seat_management_system[3] = new int[14];
        user_menu();
    }
}
