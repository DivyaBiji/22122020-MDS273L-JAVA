import java.util.Scanner;
public class Lab1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Gender (M/F): ");
        char g = sc.nextLine().charAt(0);
        System.out.println("Enter company name: ");
        String company = sc.nextLine();
        System.out.println("Enter your state:");
        String state = sc.nextLine();
        System.out.println("Employee details");
        System.out.println("Name of the employee:" +name);
        if(g == 'M'){
            System.out.println("Gender:MALE");}
        else if(g == 'F'){
            System.out.println("Gender: FEMALE");
        }
        
        switch(company.toLowerCase()){
            case "facebook":
            case "google":
            case "microsoft":
            case "samsung":
            case "ibm":
            case "apple":
            System.out.println("The employee is working in Top MNC Company.");
            break;
            default:
            break; }

        switch(state.toLowerCase()){
            case "kerala":
            case "karnataka":
            case "tamil nadu":
            case "andhra pradesh":
            case "telangana":
            System.out.println("The Employee is from the southern states of India; Preferable work location is in "+ state);
            break;
            default:
            break;
        }
        switch(state.toLowerCase()){
            case "haryana":
            case "punjab":
            case "uttarakhand":
            case "uttar pradesh":
            case "delhi":
            System.out.println("The Employee is from the northern states of India; Preferable work location is in "+ state);
            break;
            default:
            break;
        }
        switch(state.toLowerCase()){
            case "nagaland":
            case "manipur":
            case "meghalaya":
            case "tripura":
            case "arunachal pradesh":
            case "assam":
            case "mizoram":
            case "sikkim":
            case "bihar":
            case "jarkhand":
            case "orissa":

            System.out.println("The Employee is from the eastern states of India; Preferable work location is in "+ state);
            break;
            default:
            break;
        }
        switch(state.toLowerCase()){
            case "gujarat":
            case "rajasthan":
            case "goa":
            case "west bengal":
            case "assam":
            System.out.println("The Employee is from the western states of India; Preferable work location is in "+ state);
            break;
            default:
            break;
        }
        switch(state.toLowerCase()){
            case "chattisgarh":
            case "madhya pradesh":
            System.out.println("The Employee is from the central states of India; Preferable work location is in "+ state);
            break;
            default:
            break;

        }
        }
}