package com.enterprise.codingService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(CodingController.class)
public class CodingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CodingController codingController;

    @Test
    public void getRepositoriesShouldReturnStatusOKAndListOfReposWhenCalledWithId() throws Exception {
        List<String> repos = new ArrayList();

        given(codingController.getRepositories("test")).willReturn(repos);

        mockMvc.perform(get("/users/test/repos")).andExpect(status().isOk());
    }
}
