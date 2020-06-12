package TestCase;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;
import com.mycareai.TestBase;

import io.appium.java_client.MobileElement;

public class loginTest extends TestBase {

	String letsGetStarted_XPATH = "//*[@text=concat('Let', \"'\", 's Get Started')]";

	String letsGetStarted2_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
	String letsGetStarted3_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
	String letsGetStartedText = "Let's Get Started";
	String P_login_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]";
	String P_email_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText";
	String email_XPATH = "//android.widget.EditText[@text='Email']";
	String email_TEXT = "figbo4real@yahoo.com";
	String password_XPATH = "//android.widget.EditText[@text='Password']";
	String password_TEXT = "Qwertyu1";
	String password2_TEXT = "Qwertyu2";
	String loginBtn2_XPATH = "//*[@class='android.view.ViewGroup' and ./*[@text='\uF119'] and ./*[@text='Log In']]";
	String skipTour_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]";

	// Signup
	String fn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
	String firstname_XPATH = "(//android.widget.EditText[@content-desc=\"regularTextInput\"])[1]";
	String firstname33_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
	String firstname_TEXT = "figbo4real";
	String lastname_XPATH = "//android.widget.TextView[@text='Last name']";
	String lastname2_XPATH = "(//android.widget.EditText[@content-desc=\"regularTextInput\"])[2]";
	String lastname_TEXT = "Test";
	String signUpEmail_XPATH = "//android.widget.EditText[@text='Email']";
	String signUpEmail_TEXT = "qatest03@y.com";
	String signUpPassword_XPATH = "//android.widget.EditText[@text='Password']";
	String signUpPassword_TEXT = "Qwertyu1";
	String confirmPassword_XPATH = "//android.widget.EditText[@text='Confirm Password']";
	String confirmPassword_TEXT = "Qwertyu1";
	String checkbox_XPATH = "//*[@text='']";

	String checkbox2_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.widget.TextView";
	String next_XPATH = "//android.widget.TextView[@text='First name']";
	String next2_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup/android.widget.TextView[1]";
	String skipPhoneNumber_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView";

	// #Dashboard
	String AdminTxt_XPATH = "//android.widget.TextView[@text='Administrators']";
	String loginSkip_XPATH = "//android.widget.TextView[@text='Skip']";
	String loginSkip2_XPATH = "//*[@class='android.widget.TextView' and ./*[@text='Skip'] and ./*[@index='1']]";
	String loginSkip3_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]";
	String notifyIcon_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
	String notifyTxt_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]";
	String notifyBackBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]";
	String payer_XPATH = "//android.widget.TextView[@text='payer']";
	String connection_XPATH = "//android.widget.TextView[@text='Make a connection']";
	String ShareBtn_XPATH = "//android.widget.TextView[@text='Share']";
	String timelineBtn_XPATH = "//android.widget.TextView[@text='Timeline']";
	// #existing user
	String eu_connection_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String eu_connection2_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";

	String eu_payersConnection_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]";
	String eu_addconnection_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String eu_edifecsConnect_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup";
	String eu_Connect_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String eu_confirmConnect_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String eu_selectChrome_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]";
	String eu_justOnce_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]";
	String eu_edifecsUsername_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText";
	String eu_edifecsUsername_TEXT = "amanda.adams@domain.com";
	String eu_edifecsPassword_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText";
	String eu_edifecsPassword_TEXT = "password";
	String eu_edifecsLoginBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button";
	String eu_edifecsAllowBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.Button[1]";
	String eu_Continue_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
	String eu_payerBackBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]";
	String eu_connectionSettings_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String eu_deleteEdifecs_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";

	String menuBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView";
	String settingsBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView[2]";
	String accountTab_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
	String deactivateAccount_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
	String confirmBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]";

	String shareBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView";
	String addContact_XPATH = "//android.widget.TextView[@text='Add Contacts']";
	String yesUnderstandBtn_XPATH = "//android.widget.TextView[@text='Yes, I understand']";

	// #Timeline
	String timeline_XPATH = "//android.widget.TextView[@text='Timeline']";
	String skip_XPATH = "//android.widget.TextView[@text='Skip']";
	String HealthHistory2017_XPATH = "//android.widget.TextView[@text='2017']";
	String healthHistory_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]";
	String skipTimeline_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[2]";

	String claimsDropDown_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup";
	String viewClaims_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup";
	String margaret_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]";

	// #VirtualAssistance
	String virtualAss_XPATH = "//android.widget.TextView[@text='Virtual Assistant']";
	String virtualAssistant_XPATH = "//android.widget.TextView[@text='ASSISTANT']";

	String helpText_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
	String helpText_TEXT = "How can I help you today?";
	String vaTextField_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.EditText";
	String vaEnterText = "I want to view my medical records";
	String sendkeys_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView";
	String yesBtn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String yes2Btn_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";

	String practisionalVisit_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup";
	String labData_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
	String labReport_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView";
	String labReport_TEXT = "Lab Report";

	String practitionalName_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView";
	String practitional_TEXT = "Practitioner: Dr. Howard Brown";
	String noThanks_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";

	// FetchProvider
	String menu_XPATH = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView";
	String connections_XPATH = "//*[@text='Connections']";
	String provider_XPATH = "//*[@class='android.view.ViewGroup' and ./*[./*[@class='android.widget.ImageView']] and ./*[@text='Providers']]";
	String listOfProviders_XPATH = "//*[@text='']";
	String clickProvider_XPATH = "//*[@text='Connect']";
	String Connect2provider_XPATH = "//*[@text='Connect']";
	String confirmation2connect_XPATH = "//*[@text='Confirm']";

	@Rule
	public TestWatcher watcher = Factory.createWatcher();

//	@Test
//	public void InvalidLoginTest() throws IOException, InterruptedException {
//
//		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
//		log.info("App opened");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_login_XPATH)).click();
//		log.info("I already have an account clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
//		log.info("user email passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(password_XPATH)).sendKeys(password2_TEXT);
//		log.info("user password passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
//		log.info("log in button clicked");
//
//	}
//
	@Test
	public void LoginTest() throws IOException, InterruptedException {

		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
		log.info("App opened");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(P_login_XPATH)).click();
		log.info("I already have an account clicked");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
		log.info("user email passed into text box");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(password_XPATH)).sendKeys(password_TEXT);
		log.info("user password passed into text box");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
		log.info("log in button clicked");

//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		String actualString = driver.findElement(By.xpath(skip_XPATH"))).getText();
//		assertTrue(actualString.contains("Skip"));

		log.info("Login is successful");

	}
//
//	@Test
//	public void TimelineTest() throws IOException, InterruptedException {
//
//		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
//		log.info("App opened");
//
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_login_XPATH)).click();
//		log.info("I already have an account clicked");
//
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
//		log.info("user email passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(password_XPATH)).sendKeys(password_TEXT);
//		log.info("user password passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
//		log.info("log in button clicked");
//
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(skipTour_XPATH)).click();
////		log.info("Login is successful");
//
//		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(timeline_XPATH)).click();
//		log.info("Timeline clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(skipTimeline_XPATH)).click();
//		log.info("Skip button clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(healthHistory_XPATH)).click();
//		// driver.findElement(By.xpath("//android.widget.TextView[@text="2016").click();
//		log.info("Health history clicked");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(skipTimeline_XPATH)).click();
//		log.info("Skip button clicked");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(claimsDropDown_XPATH)).click();
//		log.info("Claims drop down button clicked");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		// driver.findElement(By.xpath(viewClaims_XPATH)).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@text='View']")).click();
//		log.info("View Claims is clicked");
//
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(margaret_XPATH)).isDisplayed();
////		log.info("Magret is Displayed");
//
//	}
//
//	@Test
//	public void payerConnection() throws InterruptedException, IOException {
//
//		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
//		log.info("App opened");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_login_XPATH)).click();
//		log.info("I already have an account clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
//		log.info("user email passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(password_XPATH)).sendKeys(password_TEXT);
//		log.info("user password passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
//		log.info("log in button clicked");
//
////		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(skipTour_XPATH)).click();
////		log.info("Login is successful");
//
////		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(eu_connection2_XPATH)).click();
////		log.info("Make Connection button clicked");
////		
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		driver.findElementByName("Make a connection").click();
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(menuBtn_XPATH)).click();
//		log.info("Menu icon clicked");
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(connections_XPATH)).click();
//		log.info("Connections icon clicked");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(eu_payersConnection_XPATH)).click();
//		log.info("Payer Button clicked");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(eu_addconnection_XPATH)).click();
//		log.info("Add Payer Button clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(eu_edifecsConnect_XPATH)).click();
//		log.info("Edifecs Payer clicked");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(eu_Connect_XPATH)).click();
//		log.info("Connect button clicked");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(eu_confirmConnect_XPATH)).click();
//		log.info("Confirm  Connect button clicked");
//
//	}
//
//	@Test
//	public void shareConnection() throws InterruptedException, IOException {
//
//		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
//		log.info("App opened");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_login_XPATH)).click();
//		log.info("I already have an account clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
//		log.info("user email passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(password_XPATH)).sendKeys(password_TEXT);
//		log.info("user password passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
//		log.info("log in button clicked");
//
////		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(skipTour_XPATH)).click();
////		log.info("Login is successful");
//
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(menuBtn_XPATH)).click();
//		log.info("Menu icon clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(ShareBtn_XPATH)).click();
//		log.info("Share clicked");
//
////		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(shareBtn_XPATH)).click();
////		log.info("Share button clicked");
//
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(addContact_XPATH)).click();
//		log.info("Add to contact button clicked");
//
//		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(yesUnderstandBtn_XPATH)).click();
//		log.info("Yes, I understand button clicked");
//	}
//
//	@Test
//	public void VirtualAssistance() throws IOException, InterruptedException {
//
//		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
//		log.info("App opened");
//
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_login_XPATH)).click();
//		log.info("I already have an account clicked");
//
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
//		log.info("user email passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(password_XPATH)).sendKeys(password_TEXT);
//		log.info("user password passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
//		log.info("log in button clicked");
//
////		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(skipTour_XPATH)).click();
////		log.info("Login is successful");
//
//		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(menuBtn_XPATH)).click();
//		log.info("Menu icon clicked");
//
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(virtualAssistant_XPATH)).click();
//		log.info("Virtual Assistance Clicked");
//
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		String actualString = driver.findElement(By.xpath(helpText_XPATH)).getText();
////		assertTrue(actualString.contains(helpText_TEXT));
////		log.info("Successfully launched Virtual Assistancel");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(vaTextField_XPATH)).sendKeys(vaEnterText);
//		log.info("Enter text successful");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(sendkeys_XPATH)).click();
//		log.info("Send key clicked");
//
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(yesBtn_XPATH)).click();
////		log.info("Yes button clicked");
////
////		Thread.sleep(3000);
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(yes2Btn_XPATH)).click();
////		log.info("Yes button clicked again");
////
////		Thread.sleep(3000);
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(labData_XPATH)).click();
////		log.info("Lab Data clicked");
////
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		String actualString2 = driver.findElement(By.xpath(labReport_XPATH)).getText();
////		assertTrue(actualString2.contains(labReport_TEXT));
//	}
//
////	@Test
////	public void Dashboard() throws IOException, InterruptedException {
////
////		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
////		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
////
////		log.info("App opened");
////		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(P_login_XPATH)).click();
////		log.info("I already have an account clicked");
////
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
////		log.info("user email passed into text box");
////
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(password_XPATH)).sendKeys(password_TEXT);
////		log.info("user password passed into text box");
////
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
////		log.info("log in button clicked");
////
////		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(skipTour_XPATH)).click();
////		log.info("Login is successful");
////
//////		String actualString = driver.findElement(By.xpath(skip_XPATH"))).getText();
//////		assertTrue(actualString.contains("Skip"));
////
////	}
////
//	@Test
//	public void ProviderTest() throws IOException, InterruptedException {
//
//		EnhancedAndroidDriver<MobileElement> driver = Capabilities();
//
//		log.info("App opened");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_login_XPATH)).click();
//		log.info("I already have an account clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(P_email_XPATH)).sendKeys(email_TEXT);
//		log.info("user email passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(password_XPATH)).sendKeys(password_TEXT);
//		log.info("user password passed into text box");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(loginBtn2_XPATH)).click();
//		log.info("log in button clicked");
//
////		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////		driver.findElement(By.xpath(skipTour_XPATH)).click();
////		log.info("skipped icon clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(menuBtn_XPATH)).click();
//		log.info("Menu icon clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(connections_XPATH)).click();
//		log.info("Connections icon clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(provider_XPATH)).click();
//		log.info("Provider button clicked");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(listOfProviders_XPATH)).click();
//		log.info("icon clicked to see lists of providers");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(clickProvider_XPATH)).click();
//		log.info("click on a provider");
//
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(Connect2provider_XPATH)).click();
//		log.info("connect to a provider");
//
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(confirmation2connect_XPATH)).click();
//		log.info(" confirmation to connect to a provider");
//
//	}

}
