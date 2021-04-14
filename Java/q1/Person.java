package Java.q1;
public class Person{
    String FirstName,MiddleName,LastName;
    public Person(String FirstName,String MiddleName,String LastName){
        this.FirstName =FirstName;
        this.MiddleName =MiddleName;
        this.LastName =LastName;
    }

    public  int first_name_length(){
        int len=0;
        for(char c: FirstName.toCharArray()) {
            len++;
         };
         return len;

    }
    public  int middle_name_length(){
        int len=0;
        for(char c: MiddleName.toCharArray()) {
            len++;
         };
         return len;

    }
    public  int last_name_length(){
        int len=0;
        for(char c: LastName.toCharArray()) {
            len++;
         };
         return len;

    }
    public static void main(String args[]){
 
        Person person = new Person("Krishesh", "Padma", "Shrestha");
        System.out.println("length of First string :"+person.first_name_length());
        System.out.println("length of Middle string :"+person.middle_name_length());
        System.out.println("length of Last string :"+person.last_name_length());
        }
}