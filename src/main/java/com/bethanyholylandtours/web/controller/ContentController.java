package com.bethanyholylandtours.web.controller;

import com.bethanyholylandtours.web.model.Content;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tpadmin on 2/4/14.
 */
@Controller
@RequestMapping("/content")
public class ContentController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Content get() {
        return new Content(1, "text");
    }

}
