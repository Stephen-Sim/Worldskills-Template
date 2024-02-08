package crc643f46942d9dd1fff9;


public class EntryAccessibilityDelegate
	extends crc643f46942d9dd1fff9.AccessibilityDelegateAutomationId
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitializeAccessibilityNodeInfo:(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V:GetOnInitializeAccessibilityNodeInfo_Landroid_view_View_Landroidx_core_view_accessibility_AccessibilityNodeInfoCompat_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.Platform.Android.EntryAccessibilityDelegate, Xamarin.Forms.Platform.Android", EntryAccessibilityDelegate.class, __md_methods);
	}


	public EntryAccessibilityDelegate ()
	{
		super ();
		if (getClass () == EntryAccessibilityDelegate.class) {
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.EntryAccessibilityDelegate, Xamarin.Forms.Platform.Android", "", this, new java.lang.Object[] {  });
		}
	}


	public EntryAccessibilityDelegate (android.view.View.AccessibilityDelegate p0)
	{
		super (p0);
		if (getClass () == EntryAccessibilityDelegate.class) {
			mono.android.TypeManager.Activate ("Xamarin.Forms.Platform.Android.EntryAccessibilityDelegate, Xamarin.Forms.Platform.Android", "Android.Views.View+AccessibilityDelegate, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public void onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1)
	{
		n_onInitializeAccessibilityNodeInfo (p0, p1);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
