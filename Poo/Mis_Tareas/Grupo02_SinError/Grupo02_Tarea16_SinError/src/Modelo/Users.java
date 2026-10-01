package Modelo;

public class Users {
    
    private int id;
    private String name;
    private String email;
    private String password;

    public Users() {}
    
    public Users(Object[] registro){
        id = Integer.parseInt(registro[0]+"");
        name = registro[1]+"";
        email = registro[2]+"";
        password = registro[3]+"";
    }
    
    public Object[] getRegistro(){
        return new Object[]{id,name,email,password};
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }  
}
