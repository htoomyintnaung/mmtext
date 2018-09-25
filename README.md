# MMText
Developed by Technomation

A library to embed Myanmar Unicode on Android apps because normal embedding just don't work on some(most) devices. MMText supports from api 8(Froyo 2.2).

Embedding Myanmar Unicode Standardized fonts using setTypeface don't work on devices that doesn't support reordering. Also some devices have a setting called display font and if a user choose zawgyi, he won't see unicode font even the font is embedded by setTypeface(). So, Technomation made a libarary called MMText. You can download the project and see the sample app for usage. All contributions are welcomed.

#How to use
<b>How does MMText work?</b>

MMText uses a font called “mymm.ttf”. This font is an XPartial font with two code points for each glyph. So, we can shift the code points of the String for Samsung devices. So basically, this font is neither Unicode nor Zawgyi.

<b>Embedding</b>

There are several methods to embed Myanmar Font in your views.

<code>prepareView(Context c, View v, Int EncodedText, boolean SamsungSafe, boolean Syllablebreak)</code>

The first parameter is the context of the encoded text. I think you are already familiar with this. The second one is EncodedText type. The values are mmtext.TEXT_UNICODE, mmtext.TEXT_ZAWGYI, mmtext.TEXT_XPartial. This is the original encoded type of the String of your view. The third parameter is a boolean value for Samsung devices, the characters code points will be shifted so it can display correctly on Samsung. It may effect the performance, so you can check whether the device is Samsung or not and set “false” for non Samsung devices. The last parameter is for SyllabelBreak. The sentence will be broken into words. It may also effect the performance on listviews and recyclerviews where views need to be created constantly.
<hr />
<code>prepareViewGroup(Context c, View v, Int EncodedText, boolean SamsungSafe, boolean Syllablebreak)</code>

Almost same as prepareView() but this is for view groups and it will embed all text of the views inside the particular view group. So you need to use same encoding(Unicode or Zawgyi) for all views. This works by looping all views.
<hr />
<code>prepareActivity(Context c, ViewGroup root, int EncodedText, boolean SamsungSafe, boolean SyllabelBreak)</code>

For embedding all views of an Activity including ActionBar(Toolbar). This works by looping all viewgroups.
<hr />
<b>Custom Views</b>

mmtext also provides custom views for TextView and Button views. Just use <code>&lt;mm.technomation.mmtext.MMTextView /&gt;</code> instead of <code>&lt;TextView /&gt;</code> for TextView and <code>&lt;mm.technomation.mmtext.MMButtonView /&gt;</code> instead of <Button /> for Buttons. You can use all methods and attributes as normal TextView, Button. But you must use <code>setMyanmarText(String text)</code> and <code>getMyanmarText()</code> instead of <code>setText(String text)</code> and <code>getText()</code> if you use custom views. If you use prepare… methods, you must use <code>mmtext.getMMText()</code> method to get the text of those views.

#License
GNU GPL