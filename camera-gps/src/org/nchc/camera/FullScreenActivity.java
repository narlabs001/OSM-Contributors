/***
  Copyright (c) 2013-2014 CommonsWare, LLC
  
  Licensed under the Apache License, Version 2.0 (the "License"); you may
  not use this file except in compliance with the License. You may obtain
  a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package org.nchc.camera;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class FullScreenActivity extends Activity implements
    DemoCameraFragment.Contract {
  DemoCameraFragment frag=null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.full_screen);
    frag=
        (DemoCameraFragment)getFragmentManager().findFragmentById(R.id.camera_preview);
  }

  @Override
  public boolean isSingleShotMode() {
    return(false);
  }

  @Override
  public void setSingleShotMode(boolean mode) {
    // hardcoded, unused
  }

  public void takePicture(View v) {
    frag.takeSimplePicture();
  }
}
