import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class RestTest {

    @Test
    public void testGet() {
        //@formatter:off
        given()
            .param("name", "pankaj")
            .param("location", "coimbatore")
        .when()
            .get("http://httpbin.org/get")
        .then()
            .statusCode(204);
        //@formatter:on

    }

    @Test
    public void testPost() {
        User user = new User();
        user.setName("pankaj kumar");
        user.setLocation("coimbatore");
        //@formatter:off
        User responseuser =
        given()
            .header("auth","asdf234wet3534eertge643")
            .contentType("application/json")
            .body(user)
        .when()
            .post("http://httpbin.org/post")
        .then()
            .log().all()
            .statusCode(200)
        .extract().response().as(User.class);
        //@formatter:on
    }


}
