import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.xml.stream.events.Comment;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister.Pack;
public class Menu {
	
	public static void main(String[] args){
	}
	public static void menu() {
		StringBuilder menu = new StringBuilder();
        System.out.println("\nTACO-BLOG System\n");
        System.out.println("MENU");
        System.out.println("\n");
        menu.append("1 = Bloglar� G�r");
        menu.append("2 = Blog Ekle");
        menu.append("3 = Blog ��kar");
        menu.append("4 = Sayfalar� G�r");
        menu.append("5 = Sayfa Ekle");
        menu.append("6 = Sayfa ��kar");
		menu.append("7 = Yorumlar� G�r");
		menu.append("7 = Yorum Ekle");
		menu.append("7 = Yorum ��kar");
		menu.append("4 = ��k��");
		menu.append("5 = Her �eyi Bir Text Dosyas�na Kaydet");
		System.out.println(menu);
		}
		 public static void AddPage() {
		 		StringBuilder menu = new StringBuilder();
		        menu.append("1 = Sayfa Ekle");
		        menu.append("2 = Sayfa Kald�r");
		 		System.out.println(menu);
		 	}
		 
		 	public static void AddBlog() {
		 		StringBuilder menu2 = new StringBuilder();
		 menu2.append("��erikler");
		 		menu2.append("1 = Video ��eri�i Ekle (URL Format�nda)");
		 		menu2.append("2 = Metin Olarak Ekle");
		 		menu2.append("0 = Terminate Et");
		 		System.out.println(menu2);
		 	}
		 		public static void SeeBlogs() {
		 			StringBuilder menu1 = new StringBuilder();
		 			menu1.append("Bloglar");
		 			menu1.append("1 = Blog ��eriklerini Y�kle");
		 			menu1.append("2 = Terminate Et");
		 			System.out.println(menu1);
		 	}
		 
		 	public static void AddVlog() {
		 		StringBuilder menu = new StringBuilder();
		 menu.append("1 = Video Format�nda Blog Ekle");
		 		System.out.println(menu);
		 	}
		 
		 	public static void txtBlog() {
		 		StringBuilder menu = new StringBuilder();
		 menu.append("1 = Text Format�nda Blog Ekle");
		 		System.out.println(menu);
		 	}
		 
		 	public static void AddComment() {
		 		StringBuilder menu = new StringBuilder();
		 		menu.append("1 = Yorum Ekle");
		 	}
		 
		 	public static void pag(Object BlogHelper) {
		 		StringBuilder menu = new StringBuilder();
		 		Iterator<Pack> itPages = ((Object) BlogHelper).getPages();
		 		int index = 1;
		        menu.append("Bloglar");
		 		while (itPages.hasNext()) {
		 			Pack currentPage = itPages.next();
		 			menu.append(index++);
		 			menu.append(currentPage.getTitle());
		 			System.out.println("A��klama ve Konu:" + getTitle());
		 			menu.append(currentPage.getCategory());
		 			menu.append("Ait Oldu�u Kategori:" + getCategory());
		 			menu.append(currentPage.getDate());
		 			System.out.println("Date Published:" + getDate());
		 		    menu.append(currentPage.getBody());
		 		    System.out.println("Mesaj:" + getBody());
		 			
		 		
		 		}
		 		
		 		System.out.println(menu);
		 
		 	}
		 
		 	private static String getBody() {
				return null;
			}
			private static String getDate() {
				return null;
			}
			private static String getCategory() {
				return null;
			}
			private static String getTitle() {
				return null;
			}
			public static void printPosts() {
		 		StringBuilder menu = new StringBuilder();
		 		Iterator<Post> itPosts = BlogHelper.getPosts();
		 		int index = 1;
		 
		 		menu.append("Posts");
		 		while (itPosts.hasNext()) {
		 			Post currentPost = itPosts.next();
		 			menu.append(index++);
		 	        menu.append(currentPost.getTitle());
		 			menu.append("Konu Ba�l���:" + getTitle());
		 			menu.append(currentPost.getCategory());
		 			menu.append("Kategori:" + getCategory());
		 			menu.append(currentPost.getDate());
		 			menu.append("Lokal Zaman:" + getDate());
		 			menu.append(currentPost.getBody());
		 			menu.append("Metin:" + getBody());
		 			System.out.println("Yorumlar:");
		 			Iterator<Comment> Comments = currentPost.getComments();
		 			while (Comments.hasNext()) {
		 				Comment currentComment = Comments.next();
		 				menu.append("Comments:");
		 			    System.out.println("Yorumlar: " + getComments());
		 				menu.append(((Object) currentComment).getAuthor());
		 				menu.append("Yazar(lar): " + getAuthor());
		 				menu.append(((Menu) currentComment).getDate());
		 				Object date;
						DateFormat dateFormat;
						menu.append("Lokal Zaman: " + dateFormat.format(date));
		 				menu.append(currentComment.getText());
		 				
		 				DateFormat dateFormat1 = new DateFormat("xxx/yy/qq");
		 				Date date1 = new Date();
		 				System.out.println(dateFormat1.format(date1));
		 				
		 			}
		 			
		 		}
				
				
		 		System.out.println(menu);
		 
		 	}
			private static String getComments() {
				
				return null;
			}
            private static String getAuthor() {
				
				return null;
		}
            
           
            
            
		
		
		
		


	






{
}
}
