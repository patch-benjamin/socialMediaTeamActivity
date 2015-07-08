public class YouTubeeConverter implements socialMediaEntry{

	private YouTubeVideo original;
	
    private String user;
    private String postText;
        

	public YouTubeeConverter(YouTubeVideo newOriginal){
		setConverter(newOriginal);
		convertYouTubeVideo();
	}
	
	public convertYouTubeVideo(YouTubeVideo newOriginal){
		setConverter(newOriginal);
		convertYouTubeVideo();
	}
	
	public convertYouTubeVideo(){
		setUser(original.getAuthor());
		setPostText((original.getTitle + original.getDescription));
		
	}

	public void setConverter(YouTubeVideo newOriginal){
		original = newOriginal;
	}
	
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }


}