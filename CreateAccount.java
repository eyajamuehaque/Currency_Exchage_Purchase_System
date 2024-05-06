import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateAccount {
    private String fullName;
    private String nID;
    private String userEmail;
    private String userName;
    private String userPassword;
    private File file;
    private FileWriter writer;
    private Scanner sc;

    //Empty Constructor
    public CreateAccount()
    {
        this.fullName="";
    }

    public CreateAccount(String fullName,String nID,String userEmail,String userName,String userPassword)
    {
        this.fullName=fullName;
        this.nID=nID;
        this.userEmail=userEmail;
        this.userName=userName;
        this.userPassword=userPassword;
    }

    //setter & getter method
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setnID(String nID) {
        this.nID = nID;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getFullName() {
        return fullName;
    }
    public String getnID() {
        return nID;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserPassword() {
        return userPassword;
    }

    public void addAccount()
    {
        try
        {
            file = new File("bin\\files\\Users.txt");
            file.createNewFile();
            writer  = new FileWriter(file,true);
            writer.write(getUserName()+"\t");
            writer.write(getUserPassword()+"\t");
            writer.write(getnID()+"\t");
            writer.write(getFullName()+"\t");
            writer.write(getUserEmail()+"\n");
            writer.flush();
            writer.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public boolean getAccount(String userName,String userPassword)
    {
        boolean isAuth = false;
        String path ="bin\\files\\Users.txt";
        file = new File(path);
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if(value[0].equals(userName) && value[1].equals(userPassword))
                {
                    isAuth=true;
                }
            }
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        return isAuth;
    }

}
