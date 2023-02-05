package sof3as3.kirja.Bookstore.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
	@RequestMapping("/index")
	public String indexPage() {
		return "bookstoreindexsite";
	}
}
