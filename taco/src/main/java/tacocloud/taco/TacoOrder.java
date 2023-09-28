package tacocloud.taco;
import java.util.List;
import org.hibernate.validator.constraints.CreditCardNumber;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.util.ArrayList;
import lombok.Data;

@Data
public class TacoOrder {
@NotBlank(message = "Delivery Name can't be blank")
private String deliveryName;
@NotBlank(message = "Street Name can't be blank")
private String deliveryStreet;
@NotBlank(message = "City Name can't be blank")
private String deliveryCity;
@NotBlank(message = "State Name can't be blank")
private String deliveryState;
@NotBlank(message = "Zip can't be blank")
private String deliveryZip;
@CreditCardNumber(message="Not a valid credit card number")
private String ccNumber;
@Pattern(regexp = "^(0[1-9]|1[0-2]) ([\\/]) ([2-9] [0-9])$", message = "Must be formated MM/YY")
private String ccExpiration;
@Digits(integer = 3, fraction = 0, message = "Invalid CVV")
private String ccCVV;
private List<Taco> tacos = new ArrayList<>();
public void addTaco(Taco taco) {
this.tacos.add(taco);
}
}
