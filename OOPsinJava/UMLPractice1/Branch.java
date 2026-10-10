package OOPsinJava.UMLPractice1;

public class Branch {
    private String manger_name;
    private String ifsc_code;
    private int password;

    Branch(String manger_name, String ifsc_code, int password){
        this.manger_name = manger_name;
        this.ifsc_code = ifsc_code;
        this.password = password;
    }

    public void getIfscCode(int password) {
        if(this.password == password){
            if(ifsc_code.length() >= 5)
            System.out.println("Your IFSC Code is : "+this.ifsc_code);
            else System.out.println("Invalid IFSC Code");
        }
        else {
            System.out.println("Wrong Password");
        }
    }
    public void getManagerName(int password){
        if(this.password == password){
            System.out.println(this.manger_name);
        }
        else {
            System.out.println("Wrong Password");
        }
    }
    public void setMangerName(String manger_name, int password){
        if(password == this.password){
            this.manger_name = manger_name;
            System.out.println("Manger name Update ");
        }
        else {
            System.out.println("Wrong user");
        }
    }
    public void setIfsc_code(String ifsc_code, int password){
        if (this.password == password){
            if (ifsc_code.length() == 5){
                this.ifsc_code = ifsc_code;
            }
            else {
                System.out.println("Please Enter 5 length IFSC code");
            }
        }
        else System.out.println("Wrong Password");
    }
    // Everyone can see manager name
    public String toString(){
        return "Manager Name : " +this.manger_name + " | " + "IFSC code : " +this.ifsc_code;
    }

}
