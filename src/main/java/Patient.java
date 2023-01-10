import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Patient {
    public int id;
    public String firstName;
    public String lastName;
    public String contactNumber;
    public String address;
}
