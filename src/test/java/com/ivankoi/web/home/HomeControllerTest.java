package com.ivankoi.web.home;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.tiles2.TilesView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by ivankoi on 8/7/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class HomeControllerTest {

    MockMvc mockMvc;

    @Mock
    View view;

    @Before
    public void setUp() {

        mockMvc = MockMvcBuilders.standaloneSetup(new HomeController())
                .setSingleView(view)
                .build();
    }

    @Test
    public void springMvcProperlyConfigured() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));



        mockMvc.perform(get("/home"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }


}
