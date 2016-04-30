package proj1;


import javax.script.*;


import java.util.EmptyStackException;
import java.util.Stack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class project1  extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);

	}
	Button [] arr = new Button[10];
	TextField text = new TextField();
	String res="";
	 static int size=0;   ///ÕÃ„ «·«—Ì «·ÃœÌœÂ › ﬂ· „—Â »Õ”» «·ﬂ”»—‘‰ 
	@Override
	public void start(Stage st) throws Exception {
		text.setPrefHeight(70);
		text.setPrefWidth(300);
		GridPane g = new  GridPane();
		g.add(text,0,0,6,2);	
		for(int i =1; i<10 ;i++){
			  arr[i]= new Button(Integer.toString(i));
	    	  
			  arr[i].setPrefSize(50,40);
			  
		  }
		            int k=9;
			     for(int i =2 ;i<=4 ;i++)
			    	 for(int j=2;j>=0;j--)
			    		g.add(arr[k--], j, i);
			       g.setHgap(3);
                   g.setVgap(3);		
		st.setScene(new Scene(g,300,200));
		st.setResizable(false);
	
	st.show();
	arr[1].setOnAction(e->{
		text.setText(text.getText()+arr[1].getText());
	});
	    
	arr[2].setOnAction(e->{
		text.setText((text.getText()+arr[2].getText()));
	});
	
    
	arr[3].setOnAction(e->{
		text.setText((text.getText()+arr[3].getText()));
	});
    
	arr[4].setOnAction(e->{
		text.setText((text.getText()+arr[4].getText()));
	});
    
	arr[5].setOnAction(e->{
		text.setText((text.getText()+arr[5].getText()));
	});
    
	arr[6].setOnAction(e->{
		text.setText((text.getText()+arr[6].getText()));
	});
    
	arr[7].setOnAction(e->{
		text.setText((text.getText()+arr[7].getText()));
	});
    
	arr[8].setOnAction(e->{
		text.setText((text.getText()+arr[8].getText()));
	});
    
	arr[9].setOnAction(e->{
		text.setText((text.getText()+arr[9].getText()));
		
		});
	}}
	