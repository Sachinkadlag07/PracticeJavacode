package ArrayListProblems;

public class ValidateAge {

    public static void validateAge(int age) throws InValidAgeException, YouShouldDieException {
        if(age<=18){
            throw new InValidAgeException("Age is must be above 18 to vote");
        }
        else if(age>=100){
            throw new YouShouldDieException("you should be die now ");
        }
    }
    public static void main(String[] args) {

        int age = 100;

        try {
            validateAge(age);
        } catch (InValidAgeException | YouShouldDieException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
