import com.sun.tools.internal.jxc.ConfigReader;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class APITest {

    @Test
    public void apiTest(){
        Response response = given().
                when().
                get("https://swapi.dev/api/starships/9/").
                then().extract().response();

        String responseToString = response.asString();
        Assert.assertTrue(responseToString.contains("\"name\":\"Death Star\""));




    }
}
