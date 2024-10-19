 class Solution{
    
    // user class  to hold the details of user info 
    class User{
        private String name;
        private String email;

        public User(String name, String email){
            this.name = name;
            this.email = email;
        }

        public String getName(){
            return name;
        }

        public String getEmail(){
            return email;
        }
    }


    public static void main(String[] args){
        user1 =  new User("Harsh", "harsh@gmail.com");
        // System.out.println("Name: " + user1.getName());

    }


}
