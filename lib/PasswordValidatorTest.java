package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านเป็นตัวอักษรพิมพ์เล็กเพียงอย่างเดียวควรจะ WEAK
        pw = "password";
        PasswordStrength result2 = PasswordValidator.validate("password");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed Simple password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED Expected WEAK but got " + result2);
        }

        // Test Case 3: รหัสผ่านเป็นตัวอักษรพิมเล็กและมีตัวเลขควรจะ MEDIUM
        pw = "abcd12345";
        PasswordStrength result3 = PasswordValidator.validate("abc12345");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 : "+pw+" : Passed Simple password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED Expected MEDIUM but got " + result3);
        }

        // Test Case 4: รหัสผ่านเป็นตัวอักษรผสมกับตัวเลขและตัวอักษรพิเศษควรจะ STRONG
        pw = "abcd123!@#";
        PasswordStrength result4 = PasswordValidator.validate("abc123!@#");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 : "+pw+" : Passed: Simple password is STRONG.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected STRONG but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}
