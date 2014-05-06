package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void SnaketoCamel(){
		String act = SnakeCamelUtil.snakeToCamelcase("snake");
		assertThat(act, is("Snake"));
		act = SnakeCamelUtil.snakeToCamelcase("snake_case");
		assertThat(act, is("SnakeCase"));
		act = SnakeCamelUtil.snakeToCamelcase("snake_case_abc");
		assertThat(act, is("SnakeCaseAbc"));
		act = SnakeCamelUtil.snakeToCamelcase("snake__case__abc");
		assertThat(act, is("SnakeCaseAbc"));
		act = SnakeCamelUtil.snakeToCamelcase("_snake_case__");
		assertThat(act, is("SnakeCase"));
	}
	
	@Test
	public void CameltoSnake(){
		String act = SnakeCamelUtil.camelToSnakecase("Snake");
		assertThat(act, is("snake"));
		act = SnakeCamelUtil.camelToSnakecase("SnakeCase");
		assertThat(act, is("snake_case"));
		act = SnakeCamelUtil.camelToSnakecase("SnakeCaseAbc");
		assertThat(act, is("snake_case_abc"));
		}
	@Test
	public void capi(){
		String act = SnakeCamelUtil.capitalize(" ");
		assertThat(act, is(" "));
		act = SnakeCamelUtil.capitalize("a");
		assertThat(act, is("A"));
		act = SnakeCamelUtil.capitalize("xyz");
		assertThat(act, is("Xyz"));
	}
	@Test
	public void uncapi(){
		String act = SnakeCamelUtil.uncapitalize(" ");
		assertThat(act, is(" "));
		act = SnakeCamelUtil.uncapitalize("S");
		assertThat(act, is("s"));
		act = SnakeCamelUtil.uncapitalize("Xyz");
		assertThat(act, is("xyz"));
	}
	
	

}
