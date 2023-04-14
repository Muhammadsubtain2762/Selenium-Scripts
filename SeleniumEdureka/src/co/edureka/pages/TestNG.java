package co.edureka.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG{
	public WebDriver driver;
	
	@Test
	
	public void main() {
		driver.findElement(By.id("email")).sendKeys("+923353132771");
		
		driver.findElement(By.id("pass")).sendKeys("subtain@2762");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		
		
		driver.findElement(By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.x9f619.x1n2onr6.x1ja2u2z div.x9f619.x1s65kcs.x16xn7b0.xixxii4.x17qophe.x13vifvy.x1m258z3.xoegz02.xmy5rp.x1jx94hy:nth-child(2) div.x9f619.xdt5ytf.xh8yej3.x1lliihq.x1n2onr6.xhq5o37.x1qxoq08.x1cpjm7i.x1ryaae9.x1hmns74.x1mhyesy.x1y3wzot.xaqea5y.x30kzoy.x9jhf4c.x1b1mbwd.xav7gou.x6umtig.x9lpf2z.x1eqyvvh.xfbg1o9.x1kphnah.x1de4urk.xyt8op7 div.x6s0dn4.x9f619.x78zum5.x1s65kcs.x1wsgfga.x1pi30zi.x1swvt13:nth-child(1) div.xh8yej3 div.xh8yej3.x78zum5.x6s0dn4 label.x1a2a7pz.x1qjc9v5.xnwf7zb.x40j3uw.x1s7lred.x15gyhx8.x9f619.x78zum5.x1fns5xo.x1n2onr6.xh8yej3.x1ba4aug.xmjcpbm > input.x1i10hfl.xggy1nq.x1s07b3s.x1kdt53j.x1yc453h.xhb22t3.xb5gni.xcj1dhv.x2s2ed0.xq33zhf.xjyslct.xjbqb8w.x6umtig.x1b1mbwd.xaqea5y.xav7gou.xnwf7zb.x40j3uw.x1s7lred.x15gyhx8.x9f619.xzsf02u.xdl72j9.x1iyjqo2.xs83m0k.xjb2p0i.x6prxxf.xeuugli.x1a2a7pz.x1n2onr6.x15h3p50.xm7lytj.x1sxyh0.xdvlbce.xurb0ha.x1vqgdyp.xo6swyp.x1ad04t7.x1glnyev.x1ix68h3.x19gujb8")).sendKeys("Edureka");
		
	}
	
	@BeforeMethod
	 public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muhammad Sabtain\\Desktop\\Java\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}
	
	@AfterMethod
	
public void afterMethod() {
		//driver.quit();
		
	}
}