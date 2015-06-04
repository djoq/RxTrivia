package danieljoquinn.rxtrivia;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by danieljoquinn on 6/3/15.
 */
public class RxTriviaWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("pharmaspace.org")) return false;
        if(Uri.parse(url).getHost().endsWith("facebook.com")) return false;

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}