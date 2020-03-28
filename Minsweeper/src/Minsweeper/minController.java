package Minsweeper;

import java.util.Random;

import javax.swing.JLabel;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

public class minController {
	private minView mv;
	private minModel mm;

	public minController(minView mv, minModel mm) {
		this.mv = mv;
		this.mm = mm;
		this.mv.mousePressed(new amousePressed());
	}

	public class amousePressed implements MouseEvent {

		@Override
		public int getDetail() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public AbstractView getView() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void initUIEvent(String arg0, boolean arg1, boolean arg2, AbstractView arg3, int arg4) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean getBubbles() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean getCancelable() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public EventTarget getCurrentTarget() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public short getEventPhase() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public EventTarget getTarget() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getTimeStamp() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public String getType() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void initEvent(String arg0, boolean arg1, boolean arg2) {
			// TODO Auto-generated method stub

		}

		@Override
		public void preventDefault() {
			// TODO Auto-generated method stub

		}

		@Override
		public void stopPropagation() {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean getAltKey() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public short getButton() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getClientX() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getClientY() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean getCtrlKey() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean getMetaKey() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public EventTarget getRelatedTarget() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getScreenX() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getScreenY() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean getShiftKey() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void initMouseEvent(String arg0, boolean arg1, boolean arg2, AbstractView arg3, int arg4, int arg5,
				int arg6, int arg7, int arg8, boolean arg9, boolean arg10, boolean arg11, boolean arg12, short arg13,
				EventTarget arg14) {
			// TODO Auto-generated method stub

		}

	}

	Random random = new Random();

	private JLabel statusbar;

	public void Board(JLabel statusbar) {

		this.statusbar = statusbar;

	}

	public void Minesweeper() {

        mv.initUI();
	}if(!inGame)

	{

		mm.newGame();
		mm.repaint();
	}

	if(doRepaint)
	{
		mm.repaint();
	}

}}