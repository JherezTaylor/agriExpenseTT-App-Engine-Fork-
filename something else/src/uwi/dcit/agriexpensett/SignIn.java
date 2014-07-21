package uwi.dcit.agriexpensett;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class SignIn {
	Context context;
	
	String[] accs;
	public SignIn(Context context){
		this.context=context;
	}
	public void signIn(){
		System.out.println("sign in mc");
		final CharSequence[] items = {"steffan_boodhoo@hotmail.com", "boodhoo100@gmail.com"};

	    AlertDialog.Builder builder = new AlertDialog.Builder(context);
	    builder.setTitle("Select Account");
	    builder.setItems(items, new DialogInterface.OnClickListener() {
	        @Override
			public void onClick(DialogInterface dialog, int item) {
	            Toast.makeText(context, items[item], Toast.LENGTH_SHORT).show();
	        }
	    }).show();
	}
	
	@SuppressLint("ValidFragment") 
	public class signInDialog extends DialogFragment{
		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
		    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		    builder.setTitle("Select Account").setItems(accs, new DialogInterface.OnClickListener() {
		               @Override
					public void onClick(DialogInterface dialog, int which) {
			               // The 'which' argument contains the index position
			               // of the selected item
		            	   Toast.makeText(context, accs[which]+" clicked", Toast.LENGTH_SHORT).show();
		               }
		    });
		    return builder.create();
		}
		

		
	}

}
