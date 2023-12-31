package mascot;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Search extends JFrame implements ActionListener ,WindowListener/*, MouseListener*/{
	
	JFrame frame2 = new JFrame("検索ウィンドウ");
	
	JTextField txfield = new JTextField(30);		// 最大10文字分のテキストボックス
	JButton reset_btn = new JButton("リセット");	// 初期化ボタン
	JButton submit_btn = new JButton("検索");		//検索ボタン
	
	//キーワード受け渡し用
	String keyword;
	
	boolean searchWindowCheck2;
	
	
	
	public Search(boolean searchWindowCheck){
		
		searchWindowCheck2=searchWindowCheck;
		
		// GUI画面の設定
		getContentPane().setLayout(new FlowLayout());
		// テキストボックス設置
		getContentPane().add(txfield);
				
		// リセットボタンの設置
		getContentPane().add(reset_btn);
				
		// 送信ボタンの設置
		getContentPane().add(submit_btn);
				
		// リセットボタンの処理設定
		reset_btn.addActionListener(this);
				
		// 送信ボタンの処理設定
		submit_btn.addActionListener(this);
		
		// サイズを設定
		setSize(400, 100);
				
		// GUI画面の可視化
		setVisible(true);
		
		addWindowListener(this);
		
	}
	
	//@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == reset_btn) {
			// リセットボタン押下時は、テキストボックス初期化
			txfield.setText("");
		}else if(e.getSource() == submit_btn) {
			// 送信ボタン押下時
			
			keyword=txfield.getText();
			
			//new Browser(keyword);
			
			//new Browser(keyword);
			
			System.out.println(keyword);
			
			//プルダウンウィンドウ重複チェック
			Pulldown.checkreturn(searchWindowCheck2);
			
			new Browser(keyword);
			
//			if(keyword !="") {
//				new Browser(keyword);
//			}else {
//				System.out.println("空白、入力して下さい");
//			}
			
			
			
			

		    }
		}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		Pulldown.checkreturn(searchWindowCheck2);
		//frame.dispose();
		System.out.println("プルダウンウィンドウ閉じる");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	}

	
	

//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO 自動生成されたメソッド・スタブ
//		
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO 自動生成されたメソッド・スタブ
//	}
	

	

	
