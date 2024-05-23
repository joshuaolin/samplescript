package objects;

public class homePage {

	static String orderNavigation = "//div[@class='flex pa-0 mr-3 b2b-main-menu-item fill-height'][1]";
	static String announcementCloseButton = "//button[@class='float-right hidden-sm-and-down v-btn v-btn--icon theme--light']";
	static String smileEmoticon = "//img[@src='../img/smile.png']";
	static String neutralEmoticon = "//img[@src='../img/neutral.png']";
	static String sadEmoticon = "//img[@src='../img/sad.png']";
	static String surveySubmitButton = "//button[@class='mb-4 mt-1 button-fluid v-btn v-btn--block v-btn--large v-btn--depressed theme--light default-btn']";
	
	
	public static String getOrderNavigation() {
		return orderNavigation;
	}
	
	public static String getAnnouncementCloseButton() {
		return announcementCloseButton;
	}
	
	public static String getSmileEmoticon() {
		return smileEmoticon;
	}
	
	public static String getNeutralEmoticon() {
		return neutralEmoticon;
	}
	
	public static String getSadEmoticon() {
		return sadEmoticon;
	}
	
	public static String getSurveySubmitButton() {
		return surveySubmitButton;
	}

}
