import Panel.GeneralForm;
import Panel.PageObjectSet;
import org.junit.Test;

public class FormTest extends PageObjectSet {

    GeneralForm generalForm = new GeneralForm(driver);

    @Test
    public void test_for_contact_page(){

        generalForm.selectClose();
        generalForm.selectClientRadio();
        generalForm.typeClientName();
        generalForm.typeEmail();
        generalForm.typeCompanyName();
        generalForm.typeTelephoneNumber();
        generalForm.selectPrzelewy();
        generalForm.typeDetailsBody();
        generalForm.selectRadio();

    }
}
