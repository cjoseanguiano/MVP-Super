package www.supe.mvp.com.mvp_super.iu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.ObjectGraph;
import www.supe.mvp.com.mvp_super.R;
import www.supe.mvp.com.mvp_super.contract.Contract;
import www.supe.mvp.com.mvp_super.dagger.ModuleApp;

public class MainActivity extends AppCompatActivity implements Contract.View {
    @Inject
    Contract.Presenter presenter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ObjectGraph objectGraph = ObjectGraph.create(new ModuleApp());
        objectGraph.inject(this);
        presenter.setView(this);

        loadViews();
    }

    private void loadViews() {
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.requestText();
            }
        });
    }

    @Override
    public void showText(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
