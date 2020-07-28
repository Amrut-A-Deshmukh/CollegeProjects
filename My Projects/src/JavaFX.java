import java.sql.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.image.*;
public class JavaFX extends Application
{
	Label response;
	Label response1;
	Label response2;
	public static void main(String[] args)
	{
		launch(args);
	}
	public void start(Stage myStage)
	{
		myStage.setTitle("Pro Shopping");
		Image icon=new Image("file:logo.png");
		myStage.getIcons().add(icon);
		FlowPane root=new FlowPane();
		root.setAlignment(Pos.CENTER);
		Scene myScene=new Scene(root,520,700);
		myStage.setScene(myScene);
		response=new Label();
		response1=new Label();
		response2=new Label();
		Image i1=new Image("file:Smartphones.jpg");
		ImageView img=new ImageView(i1);
		img.setFitHeight(150);
		img.setFitWidth(150);
		Button btn1=new Button("Smartphones",img);
		Image i2=new Image("file:Clothing.jpg");
		ImageView img2=new ImageView(i2);
		img2.setFitHeight(150);
		img2.setFitWidth(150);
		Button btn2=new Button("Clothing",img2);
		Image i4=new Image("file:Sports.jpg");
		ImageView img4=new ImageView(i4);
		img4.setFitHeight(150);
		img4.setFitWidth(150);
		Button btn4=new Button("Sports",img4);
		btn1.setContentDisplay(ContentDisplay.TOP);
		btn2.setContentDisplay(ContentDisplay.TOP);
		btn4.setContentDisplay(ContentDisplay.TOP);
		btn1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				Image i=new Image("file:Asus ZenPhone.jpg");
				ImageView iv=new ImageView(i);
				iv.setFitHeight(150);
				iv.setFitWidth(150);
				Image i1=new Image("file:IPhone.jpg");
				ImageView iv1=new ImageView(i1);
				iv1.setFitHeight(150);
				iv1.setFitWidth(150);
				Image i2=new Image("file:PocoPhone.jpg");
				ImageView iv2=new ImageView(i2);
				iv2.setFitHeight(150);
				iv2.setFitWidth(150);
				Image i3=new Image("file:Asus ROG.jpg");
				ImageView iv3=new ImageView(i3);
				iv3.setFitHeight(150);
				iv3.setFitWidth(150);
				Image i4=new Image("file:S10+.jpg");
				ImageView iv4=new ImageView(i4);
				iv4.setFitHeight(150);
				iv4.setFitWidth(150);
				Image i5=new Image("file:Honor.jpg");
				ImageView iv5=new ImageView(i5);
				iv5.setFitHeight(150);
				iv5.setFitWidth(150);
				Image i6=new Image("file:One Power.jpg");
				ImageView iv6=new ImageView(i6);
				iv6.setFitHeight(150);
				iv6.setFitWidth(150);
				Image i7=new Image("file:A2.jpg");
				ImageView iv7=new ImageView(i7);
				iv7.setFitHeight(150);
				iv7.setFitWidth(150);
				Image i8=new Image("file:SE.jpg");
				ImageView iv8=new ImageView(i8);
				iv8.setFitHeight(150);
				iv8.setFitWidth(150);
				Image i9=new Image("file:M20.jpg");
				ImageView iv9=new ImageView(i9);
				iv9.setFitHeight(150);
				iv9.setFitWidth(150);
				Button btn1=new Button("Asus ZenFone Max M1",iv);
				Button btn2=new Button("IPhone XS Max",iv1);
				Button btn3=new Button("Xaomi Pocophone F1",iv2);
				Button btn4=new Button("Asus ROG phone",iv3);
				Button btn5=new Button("Samsung Galaxy S10+",iv4);
				Button btn6=new Button("Honor Play",iv5);
				Button btn7=new Button("Moto One Power",iv6);
				Button btn8=new Button("Xaomi Mi A2",iv7);
				Button btn9=new Button("IPhone SE",iv8);
				Button btn0=new Button("Smasung M20",iv9);
				FlowPane root=new FlowPane();
				Button btn=new Button("Back");
				btn.setOnAction(e ->
				{
						myStage.setScene(myScene);			
				});
				root.setAlignment(Pos.CENTER);
				Scene s1=new Scene(root,850,700);
				btn1.setContentDisplay(ContentDisplay.TOP);
				btn2.setContentDisplay(ContentDisplay.TOP);
				btn3.setContentDisplay(ContentDisplay.TOP);
				btn4.setContentDisplay(ContentDisplay.TOP);
				btn5.setContentDisplay(ContentDisplay.TOP);
				btn6.setContentDisplay(ContentDisplay.TOP);
				btn7.setContentDisplay(ContentDisplay.TOP);
				btn8.setContentDisplay(ContentDisplay.TOP);
				btn9.setContentDisplay(ContentDisplay.TOP);
				btn0.setContentDisplay(ContentDisplay.TOP);
				btn0.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								myStage.setScene(s1);
							}			
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);			
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:M20.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Samsung M20' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										myStage.setScene(scene);
									}			
								});
								Button butn=new Button("Home");
								butn.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										myStage.setScene(myScene);
									}			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:M20.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Samsung M20' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:M20.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Samsung M20' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn9.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);		
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);			
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:SE.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='IPhone SE' and Website='FlipKart';");
									response1.setText("\t\t\tPrice\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:SE.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='IPhone SE' and Website='Amazon';");
									response1.setText("\t\t\tPrice\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:SE.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='IPhone SE' and Website='Snapdeal';");
									response1.setText("\t\t\tPrice\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn8.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);		
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);		
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:A2.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Xaomi Mi A2' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText(res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:A2.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Xaomi Mi A2' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText(res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:A2.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Xaomi Mi A2' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText(res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn7.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);			
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);			
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:One Power.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Moto One Power' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:One Power.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Moto One Power' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:One Power.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Moto One Power' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn6.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);			
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);		
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Honor.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Honor Play' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Honor.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Honor Play' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Honor.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Honor Play' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn5.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);			
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);			
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:S10+.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Samsung Galaxy S10+' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:S10+.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Samsung Galaxy S10+' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:S10+.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Samsung Galaxy S10+' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn4.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);			
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);		
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,560,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Asus ROG.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Azus ROG Phone' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,560,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Asus ROG.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Azus ROG Phone' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,560,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Asus ROG.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Azus ROG Phone' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn3.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);			
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);			
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,580,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:PocoPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Xaomi Pocophone F1' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,580,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:PocoPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Xaomi Pocophone F1' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,580,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:PocoPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Xaomi Pocophone F1' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t\t\t\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn2.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);			
						});
						Button butn=new Button("Home");
						butn.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								myStage.setScene(myScene);
							}			
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:IPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='IPhone XS Max' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText(res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:IPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='IPhone XS Max' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText(res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:IPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='IPhone XS Max' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText(res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});
				btn1.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene scene=new Scene(root,500,700);
						Image i=new Image("file:Snapdeal.jpg");
						ImageView iv=new ImageView(i);
						iv.setFitHeight(150);
						iv.setFitWidth(150);
						Image i1=new Image("file:FlipKart.png");
						ImageView iv1=new ImageView(i1);
						iv1.setFitHeight(150);
						iv1.setFitWidth(150);
						Image i2=new Image("file:Amazon.png");
						ImageView iv2=new ImageView(i2);
						iv2.setFitHeight(150);
						iv2.setFitWidth(150);
						Button btn1=new Button("Flipkart",iv1);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
								myStage.setScene(s1);		
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
								myStage.setScene(myScene);			
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene flip=new Scene(root,450,700);
								myStage.setScene(flip);
								Image i2=new Image("file:FlipKart.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Asus ZenPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Azus ZenPhone Max M1' and Website='FlipKart';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn2=new Button("Amazon",iv2);
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene amaz=new Scene(root,450,700);
								myStage.setScene(amaz);
								Image i2=new Image("file:Amazon.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Asus ZenPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Azus ZenPhone Max M1' and Website='Amazon';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t\t"+res.getInt("Price")+"\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);		
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);		
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						Button btn3=new Button("Snapdeal",iv);
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene snap=new Scene(root,450,700);
								myStage.setScene(snap);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Image i1=new Image("file:Asus ZenPhone.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								try
								{
									Connection c=DriverManager.getConnection("jdbc:sqlite:file:Trial2.db");
									Statement st=c.createStatement();
									ResultSet res=st.executeQuery("Select * from Smartphones where Name='Azus ZenPhone Max M1' and Website='Snapdeal';");
									response1.setText("Price\t\tRating\t\tProShopping Review");
									response.setText("\t"+res.getInt("Price")+"\t\t"+res.getInt("Rating")+"\t\t"+res.getString("ProShopping Review"));
								}
								catch(SQLException e)
								{
									response.setText("Caught");
								}
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(scene);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
								root.setAlignment(Pos.CENTER);
								myStage.show();
							}
						});
						root.getChildren().addAll(iv,btn1,btn2,btn3,btn,butn);
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						myStage.setScene(scene);
						myStage.show();
					}
				});		
				root.getChildren().addAll(iv,iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btn);
				myStage.setScene(s1);
				myStage.show();
			}
		});
		btn2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				FlowPane root=new FlowPane();
				Scene cloth=new Scene(root,350,500);
				Image man=new Image("file:MW.jpg");
				ImageView men=new ImageView(man);
				men.setFitHeight(150);
				men.setFitWidth(150);
				Image woman=new Image("file:WW.jpg");
				ImageView women=new ImageView(woman);
				women.setFitHeight(150);
				women.setFitWidth(150);
				Button btn=new Button("Back");
				btn.setOnAction(e ->
				{
						myStage.setScene(myScene);			
				});
				Button btn1=new Button("Men's Wear",men);
				btn1.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene mw=new Scene(root,850,700);
						Image i1=new Image("file:Blue Jeans.jpg");
						ImageView img1=new ImageView(i1);
						img1.setFitHeight(150);
						img1.setFitWidth(150);
						Image i2=new Image("file:Red Shirt.jpg");
						ImageView img2=new ImageView(i2);
						img2.setFitHeight(150);
						img2.setFitWidth(150);
						Image i3=new Image("file:Black Pant.jpg");
						ImageView img3=new ImageView(i3);
						img3.setFitHeight(150);
						img3.setFitWidth(150);
						Image i4=new Image("file:Blue TShirt.jpg");
						ImageView img4=new ImageView(i4);
						img4.setFitHeight(150);
						img4.setFitWidth(150);
						Image i5=new Image("file:White Shorts.jpg");
						ImageView img5=new ImageView(i5);
						img5.setFitHeight(150);
						img5.setFitWidth(150);
						Button btn1=new Button("Blue Jeans Pant",img1);
						Button btn2=new Button("Red Formal Full Shirt",img2);
						Button btn3=new Button("Black Formal Pant",img3);
						Button btn4=new Button("Blue T-Shirt",img4);
						Button btn5=new Button("White Shorts",img5);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
							myStage.setScene(cloth);
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
							myStage.setScene(myScene);
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene bj=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(mw);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue Jeans.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Blue Jeans Pant' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bj);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue Jeans.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Blue Jeans Pant' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bj);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue Jeans.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Blue Jeans Pant' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bj);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(bj);
								myStage.show();
							}
						});
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene rffs=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(mw);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Red Shirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Red Formal Full Shirt' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rffs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Red Shirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Red Formal Full Shirt' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rffs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Red Shirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Red Formal Full Shirt' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rffs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(rffs);
								myStage.show();
							}
						});
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene bfp=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(mw);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Black Pant.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Black Formal Pant' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bfp);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Black Pant.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Black Formal Pant' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bfp);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Black Pant.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Black Formal Pant' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bfp);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(bfp);
								myStage.show();
							}
						});
						btn4.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene bt=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(mw);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue TShirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Blue T-Shirt' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bt);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue TShirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Blue T-Shirt' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bt);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue TShirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='Blue T-Shirt' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bt);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(bt);
								myStage.show();
							}
						});
						btn5.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene gt=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(mw);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:White Shorts.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
					
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gt);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='White Shorts' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response2.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response2,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:White Shorts.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
					
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gt);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='White Shorts' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response2.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response2,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:White Shorts.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
					
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gt);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Men2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Men where Name='White Shorts' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response2.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response2,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(gt);
								myStage.show();
							}
						});
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						btn4.setContentDisplay(ContentDisplay.TOP);
						btn5.setContentDisplay(ContentDisplay.TOP);
						root.getChildren().addAll(img1,img2,img3,img4,img5,btn1,btn2,btn3,btn4,btn5,btn,butn);
						myStage.setScene(mw);
						myStage.show();
					}
				});
				Button btn2=new Button("Women's Wear",women);
				btn2.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene ww=new Scene(root,850,700);
						Image i1=new Image("file:Pink Chudidhar.jpg");
						ImageView img1=new ImageView(i1);
						img1.setFitHeight(150);
						img1.setFitWidth(150);
						Image i2=new Image("file:Red Saree.jpg");
						ImageView img2=new ImageView(i2);
						img2.setFitHeight(150);
						img2.setFitWidth(150);
						Image i3=new Image("file:Blue Skirt.jpg");
						ImageView img3=new ImageView(i3);
						img3.setFitHeight(150);
						img3.setFitWidth(150);
						Image i4=new Image("file:Bride.jpg");
						ImageView img4=new ImageView(i4);
						img4.setFitHeight(150);
						img4.setFitWidth(150);
						Image i5=new Image("file:Green Gown.jpg");
						ImageView img5=new ImageView(i5);
						img5.setFitHeight(150);
						img5.setFitWidth(150);
						Button btn1=new Button("Pink Chudidhar",img1);
						Button btn2=new Button("Red Saree",img2);
						Button btn3=new Button("Blue Skirt",img3);
						Button btn4=new Button("White Brides Dress",img4);
						Button btn5=new Button("Green Gown",img5);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
							myStage.setScene(cloth);
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
							myStage.setScene(myScene);
						});
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene pc=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(ww);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Pink Chudidhar.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Pink Chudidhar' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(pc);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,580,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Pink Chudidhar.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Pink Chudidhar' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t\t\t\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(pc);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Pink Chudidhar.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Pink Chudidhar' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(pc);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(pc);
								myStage.show();
							}
						});
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene rs=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(ww);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Red Saree.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Red Saree' and Website='Myntra';");
											response1.setText("\tPrice\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
									
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Red Saree.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Red Saree' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
									
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Red Saree.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Red Saree' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
									
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(rs);
								myStage.show();
							}
						});
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene bs=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(ww);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue Skirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Blue Skirt' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue Skirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Blue Skirt' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Blue Skirt.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Blue Skirt' and Website='Jabong';");
											response1.setText("\t\tPrice\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(bs);
								myStage.show();
							}
						});
						btn4.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene bd=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(ww);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Bride.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='White Bride Dress' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bd);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,550,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Bride.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='White Bride Dress' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t\t\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bd);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Bride.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='White Bride Dress' and Website='Jabong';");
											response1.setText("\tPrice\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bd);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(bd);
								myStage.show();
							}
						});
						btn5.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene gg=new Scene(root,500,700);
								Image m=new Image("file:Myntra.jpg");
								ImageView m1=new ImageView(m);
								m1.setFitHeight(150);
								m1.setFitWidth(150);
								Image a=new Image("file:Amazon.png");
								ImageView a1=new ImageView(a);
								a1.setFitHeight(150);
								a1.setFitWidth(150);
								Image j=new Image("file:Jabong.png");
								ImageView j1=new ImageView(j);
								j1.setFitHeight(150);
								j1.setFitWidth(150);
								Button btn1=new Button("Myntra",m1);
								Button btn2=new Button("Amazon",a1);
								Button btn3=new Button("Jabong",j1);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
									myStage.setScene(ww);
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
									myStage.setScene(myScene);
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Green Gown.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Green Gown' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gg);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Green Gown.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Green Gown' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gg);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Jabong.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Green Gown.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Women2.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Women where Name='Green Gown' and Website='Jabong';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gg);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(m1,a1,j1,btn1,btn2,btn3,btn,butn);
								myStage.setScene(gg);
								myStage.show();
							}
						});
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						btn4.setContentDisplay(ContentDisplay.TOP);
						btn5.setContentDisplay(ContentDisplay.TOP);
						root.getChildren().addAll(img1,img2,img3,img4,img5,btn1,btn2,btn3,btn4,btn5,btn,butn);
						myStage.setScene(ww);
						myStage.setResizable(false);
						myStage.show();
					}
				});
				root.setAlignment(Pos.CENTER);
				btn1.setContentDisplay(ContentDisplay.TOP);
				btn2.setContentDisplay(ContentDisplay.TOP);
				root.getChildren().addAll(men,women,btn1,btn2,btn);
				myStage.setScene(cloth);
				myStage.setResizable(false);
				myStage.show();
			}
		});
		btn4.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent ae)
			{
				FlowPane root=new FlowPane();
				Scene sport=new Scene(root,350,500);
				Image i1=new Image("file:Sports Equip.jpg");
				ImageView img1=new ImageView(i1);
				img1.setFitHeight(150);
				img1.setFitWidth(150);
				Image i2=new Image("file:Sports Kits.jpg");
				ImageView img2=new ImageView(i2);
				img2.setFitHeight(150);
				img2.setFitWidth(150);
				Button btn=new Button("Back");
				btn.setOnAction(e ->
				{
						myStage.setScene(myScene);			
				});
				Button btn1=new Button("Sport's Equipment",img1);
				Button btn2=new Button("Sports Kits",img2);
				btn1.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene eqp=new Scene(root,850,500);
						Image i1=new Image("file:Football.jpg");
						ImageView img1=new ImageView(i1);
						img1.setFitHeight(150);
						img1.setFitWidth(150);
						Image i2=new Image("file:Studs.jpg");
						ImageView img2=new ImageView(i2);
						img2.setFitHeight(150);
						img2.setFitWidth(150);
						Image i3=new Image("file:Bat.jpg");
						ImageView img3=new ImageView(i3);
						img3.setFitHeight(150);
						img3.setFitWidth(150);
						Image i4=new Image("file:Ball.jpg");
						ImageView img4=new ImageView(i4);
						img4.setFitHeight(150);
						img4.setFitWidth(150);
						Image i5=new Image("file:Goalkeeper.jpg");
						ImageView img5=new ImageView(i5);
						img5.setFitHeight(150);
						img5.setFitWidth(150);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
							myStage.setScene(sport);
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
							myStage.setScene(myScene);
						});
						Button btn1=new Button("Football",img1);
						Button btn2=new Button("Football Studs",img2);
						Button btn3=new Button("Cricket Bat",img3);
						Button btn4=new Button("Cricket Ball",img4);
						Button btn5=new Button("GoalKeeper Gloves",img5);
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene fb=new Scene(root,500,700);
								Image i=new Image("file:FlipKart.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Amazon.png");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Flipkart",iv);
								Button btn2=new Button("Amazon",iv1);
								Button btn3=new Button("Snapdeal",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(eqp);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:FlipKart.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Football.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Football' and Website='FlipKart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(fb);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Football.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Football' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(fb);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Snapdeal.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Football.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Football' and Website='Snapdeal';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(fb);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(fb);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene fs=new Scene(root,500,700);
								Image i=new Image("file:FlipKart.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Amazon.png");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Flipkart",iv);
								Button btn2=new Button("Amazon",iv1);
								Button btn3=new Button("Snapdeal",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(eqp);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:FlipKart.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Studs.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Football Studs' and Website='FlipKart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(fs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Studs.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Football Studs' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(fs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Snapdeal.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Studs.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Football Studs' and Website='Snapdeal';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(fs);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(fs);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene cbat=new Scene(root,500,700);
								Image i=new Image("file:FlipKart.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Amazon.png");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Flipkart",iv);
								Button btn2=new Button("Amazon",iv1);
								Button btn3=new Button("Snapdeal",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(eqp);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:FlipKart.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Bat.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Cricket Bat' and Website='FlipKart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(cbat);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Bat.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Cricket Bat' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(cbat);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Snapdeal.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Bat.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Cricket Bat' and Website='Snapdeal';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(cbat);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(cbat);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn4.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene cball=new Scene(root,500,700);
								Image i=new Image("file:FlipKart.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Amazon.png");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Flipkart",iv);
								Button btn2=new Button("Amazon",iv1);
								Button btn3=new Button("Snapdeal",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(eqp);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:FlipKart.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Ball.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Cricket Ball' and Website='FlipKart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(cball);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Ball.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Cricket Ball' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(cball);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Snapdeal.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Ball.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Cricket Ball' and Website='Snapdeal';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(cball);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(cball);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn5.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene gg=new Scene(root,500,700);
								Image i=new Image("file:FlipKart.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Amazon.png");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Snapdeal.jpg");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Flipkart",iv);
								Button btn2=new Button("Amazon",iv1);
								Button btn3=new Button("Snapdeal",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(eqp);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:FlipKart.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Goalkeeper.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Goalkeeper Gloves' and Website='FlipKart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gg);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Amazon.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Goalkeeper.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Goalkeeper Gloves' and Website='Amazon';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gg);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Snapdeal.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Goalkeeper.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Eqp.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Equip where Name='Goalkeeper Gloves' and Website='Snapdeal';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(gg);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(gg);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						btn4.setContentDisplay(ContentDisplay.TOP);
						btn5.setContentDisplay(ContentDisplay.TOP);
						root.getChildren().addAll(img1,img2,img3,img4,img5,btn1,btn2,btn3,btn4,btn5,btn,butn);
						myStage.setScene(eqp);
						myStage.setResizable(false);
						myStage.show();
					}
				});
				btn2.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ae)
					{
						FlowPane root=new FlowPane();
						Scene kit=new Scene(root,850,500);
						Image i1=new Image("file:Barcelona.jpg");
						ImageView img1=new ImageView(i1);
						img1.setFitHeight(150);
						img1.setFitWidth(150);
						Image i2=new Image("file:Real Madrid.jpg");
						ImageView img2=new ImageView(i2);
						img2.setFitHeight(150);
						img2.setFitWidth(150);
						Image i3=new Image("file:Liverpool.jpg");
						ImageView img3=new ImageView(i3);
						img3.setFitHeight(150);
						img3.setFitWidth(150);
						Image i4=new Image("file:India.jpg");
						ImageView img4=new ImageView(i4);
						img4.setFitHeight(150);
						img4.setFitWidth(150);
						Image i5=new Image("file:Australia.jpg");
						ImageView img5=new ImageView(i5);
						img5.setFitHeight(150);
						img5.setFitWidth(150);
						Button btn=new Button("Back");
						btn.setOnAction(e ->
						{
							myStage.setScene(sport);
						});
						Button butn=new Button("Home");
						butn.setOnAction(e ->
						{
							myStage.setScene(myScene);
						});
						Button btn1=new Button("Barcelona Home Kit",img1);
						Button btn2=new Button("Real Madrid Home Kit",img2);
						Button btn3=new Button("Liverpool Home Kit",img3);
						Button btn4=new Button("India Cricket Kit",img4);
						Button btn5=new Button("Australia Cricket Kit",img5);
						btn1.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene bk=new Scene(root,500,700);
								Image i=new Image("file:Zeal.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Myntra.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Khel.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Zeal Evince",iv);
								Button btn2=new Button("Myntra",iv1);
								Button btn3=new Button("Khel Mart",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(kit);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Zeal.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Barcelona.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Barcelona Home Kit' and Website='Zeal Evince';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Barcelona.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Barcelona Home Kit' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Khel.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Barcelona.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Barcelona Home Kit' and Website='Khel Mart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(bk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(bk);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn2.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene rmk=new Scene(root,500,700);
								Image i=new Image("file:Zeal.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Myntra.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Khel.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Zeal Evince",iv);
								Button btn2=new Button("Myntra",iv1);
								Button btn3=new Button("Khel Mart",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(kit);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Zeal.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Real Madrid.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Real Madrid Home Kit' and Website='Zeal Evince';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rmk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Real Madrid.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Real Madrid Home Kit' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rmk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Khel.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Real Madrid.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Real Madrid Home Kit' and Website='Khel Mart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(rmk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(rmk);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn3.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene lk=new Scene(root,500,700);
								Image i=new Image("file:Zeal.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Myntra.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Khel.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Zeal Evince",iv);
								Button btn2=new Button("Myntra",iv1);
								Button btn3=new Button("Khel Mart",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(kit);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Zeal.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Liverpool.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Liverpool Home Kit' and Website='Zeal Evince';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(lk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Liverpool.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Liverpool Home Kit' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(lk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Khel.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Liverpool.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Liverpool Home Kit' and Website='Khel Mart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(lk);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(lk);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn4.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene ik=new Scene(root,500,700);
								Image i=new Image("file:Zeal.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Myntra.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Khel.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Zeal Evince",iv);
								Button btn2=new Button("Myntra",iv1);
								Button btn3=new Button("Khel Mart",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(kit);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Zeal.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:India.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='India Cricket Kit' and Website='Zeal Evince';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(ik);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:India.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='India Cricket Kit' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(ik);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Khel.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:India.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='India Cricket Kit' and Website='Khel Mart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(ik);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(ik);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						btn5.setOnAction(new EventHandler<ActionEvent>()
						{
							public void handle(ActionEvent ae)
							{
								FlowPane root=new FlowPane();
								Scene ak=new Scene(root,500,700);
								Image i=new Image("file:Zeal.png");
								ImageView iv=new ImageView(i);
								iv.setFitHeight(150);
								iv.setFitWidth(150);
								Image i1=new Image("file:Myntra.jpg");
								ImageView iv1=new ImageView(i1);
								iv1.setFitHeight(150);
								iv1.setFitWidth(150);
								Image i2=new Image("file:Khel.png");
								ImageView iv2=new ImageView(i2);
								iv2.setFitHeight(150);
								iv2.setFitWidth(150);
								Button btn1=new Button("Zeal Evince",iv);
								Button btn2=new Button("Myntra",iv1);
								Button btn3=new Button("Khel Mart",iv2);
								Button btn=new Button("Back");
								btn.setOnAction(e ->
								{
										myStage.setScene(kit);			
								});
								Button butn=new Button("Home");
								butn.setOnAction(e ->
								{
										myStage.setScene(myScene);			
								});
								btn1.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Zeal.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Australia.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Australia Cricket Kit' and Website='Zeal Evince';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText(res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(ak);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn2.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Myntra.jpg");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Australia.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Australia Cricket Kit' and Website='Myntra';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(ak);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								btn3.setOnAction(new EventHandler<ActionEvent>()
								{
									public void handle(ActionEvent ae)
									{
										FlowPane root=new FlowPane();
										Scene amaz=new Scene(root,450,700);
										myStage.setScene(amaz);
										Image i2=new Image("file:Khel.png");
										ImageView iv2=new ImageView(i2);
										iv2.setFitHeight(150);
										iv2.setFitWidth(150);
										Image i1=new Image("file:Australia.jpg");
										ImageView iv1=new ImageView(i1);
										iv1.setFitHeight(150);
										iv1.setFitWidth(150);
										try
										{
											Connection c=DriverManager.getConnection("jdbc:sqlite:file:Kits.db");
											Statement st=c.createStatement();
											ResultSet res=st.executeQuery("Select * from Kit where Name='Australia Cricket Kit' and Website='Khel Mart';");
											response1.setText("Price\t\tRating\t\tProShopping Review");
											response.setText("\t\t"+res.getString("Price")+"\t\t"+res.getString("Rating")+"\t\t"+res.getString("ProShopping Review"));
										}
										catch(SQLException e)
										{
											response.setText("Caught");
										}
										Button btn=new Button("Back");
										btn.setOnAction(e ->
										{
												myStage.setScene(ak);		
										});
										Button butn=new Button("Home");
										butn.setOnAction(e ->
										{
												myStage.setScene(myScene);		
										});
										root.getChildren().addAll(iv2,iv1,btn,butn,response1,response);	
										root.setAlignment(Pos.CENTER);
										myStage.setResizable(false);
										myStage.show();
									}
								});
								root.setAlignment(Pos.CENTER);
								btn1.setContentDisplay(ContentDisplay.TOP);
								btn2.setContentDisplay(ContentDisplay.TOP);
								btn3.setContentDisplay(ContentDisplay.TOP);
								root.getChildren().addAll(iv,iv1,iv2,btn1,btn2,btn3,btn,butn);
								myStage.setScene(ak);
								myStage.setResizable(false);
								myStage.show();
							}
						});
						root.setAlignment(Pos.CENTER);
						btn1.setContentDisplay(ContentDisplay.TOP);
						btn2.setContentDisplay(ContentDisplay.TOP);
						btn3.setContentDisplay(ContentDisplay.TOP);
						btn4.setContentDisplay(ContentDisplay.TOP);
						btn5.setContentDisplay(ContentDisplay.TOP);
						root.getChildren().addAll(img1,img2,img3,img4,img5,btn1,btn2,btn3,btn4,btn5,btn,butn);
						myStage.setScene(kit);
						myStage.setResizable(false);
						myStage.show();
					}
				});
				root.setAlignment(Pos.CENTER);
				btn1.setContentDisplay(ContentDisplay.TOP);
				btn2.setContentDisplay(ContentDisplay.TOP);
				root.getChildren().addAll(img1,img2,btn1,btn2,btn);
				myStage.setScene(sport);
				myStage.setResizable(false);
				myStage.show();
			}
		});
		Button exit=new Button("Exit");
		exit.setOnAction(e ->
		{
			System.exit(0);
		});
		root.getChildren().addAll(btn1,btn2,btn4,exit);
		myStage.setResizable(false);
		myStage.show();
	}
}