package nyoung.youngmarket.model;
import lombok.Data;

@Data
public class UserModel {
    private String id;
    private String username;
    private String password;
    private String address;
    private String phone;
}
