package snakecamel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void SnaketoCamel(){
		String act = SnakeCamelUtil.snakeToCamelcase("snake_case");
		assertThat(act, is("SnakeCase"));
	}
	
	@Test
	public void CameltoSnake(){
		String act = SnakeCamelUtil.camelToSnakecase("SnakeCase");
		assertThat(act, is("snake_case"));
		}
	
	

}
