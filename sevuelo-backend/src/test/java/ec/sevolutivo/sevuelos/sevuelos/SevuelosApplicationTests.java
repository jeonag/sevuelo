package ec.sevolutivo.sevuelos.sevuelos;

import ec.sevolutivo.sevuelos.sevuelos.domain.Request;
import ec.sevolutivo.sevuelos.sevuelos.web.rest.RequestResource;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@AutoConfigureMockMvc
@SpringBootTest
class SevuelosApplicationTests {

    @InjectMocks
    private RequestResource requestResource;

    @Autowired
    MockMvc mockMvc;

    @Test
    void contextLoads() {
        requestResource.getRequest(1L);
    }

    @Test
    void contextLoadsResquest() {
        Request response = new Request();
        String id = "2";
        try {
            mockMvc.perform(
                    get("/api/requests")
                            .accept(MediaType.APPLICATION_JSON))
                    .andDo(MockMvcResultHandlers.print());
        } catch (Exception e) {

        }
    }

    @Test
    void contextLoadsResquestBy() {
        Long id = 2L;
        try {
            mockMvc.perform(
                    get("/api/requests/{id}", id)
                            .accept(MediaType.APPLICATION_JSON))
                    .andDo(MockMvcResultHandlers.print());
        } catch (Exception e) {

        }
    }

}

