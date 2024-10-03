/*
 * Create a Custom execption class to check
 * an input age is valid for voing or not 
 */

 class Vote{
    void VoteAge(int age){
            if(age<18){
                throw new AgeCheck("Inval age");
            }
            else{
                System.out.println("HI");
            }
    }
}

class AgeCheck  extends RuntimeException{
    public AgeCheck(String message){
        super(message);
    }
    try{
        
    }
}


