package com.uservoice.uservoicesdk.activity;

import android.os.Bundle;

import com.uservoice.uservoicesdk.R;
import com.uservoice.uservoicesdk.ui.InstantAnswersAdapter;
import com.uservoice.uservoicesdk.ui.PostIdeaAdapter;

public class PostIdeaActivity extends InstantAnswersActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(R.string.submit_idea);
	}

	@Override
	protected InstantAnswersAdapter createAdapter() {
		return new PostIdeaAdapter(this);
	}

}