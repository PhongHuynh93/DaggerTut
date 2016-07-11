package dhbk.android.daggertut.network;

import javax.inject.Inject;

import dhbk.android.daggertut.MVPApp;

/**
 * Created by huynhducthanhphong on 7/11/16.
 */
public class TwitterAPI {

    private OKClient mOkClient;

    @Inject
    public TwitterAPI(OKClient okClient, MVPApp app) {
        mOkClient = okClient;
        //... do stuff//
    }

    public String fetchTweetFromServer(){
        return mOkClient.getResponse() + " some parsing done";
    }
}