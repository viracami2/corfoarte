package com.corfoarte.victorcastro.corpoarte.Grupos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.corfoarte.victorcastro.corpoarte.R;
import com.corfoarte.victorcastro.corpoarte.io.ApiAdapter;
import com.corfoarte.victorcastro.corpoarte.io.Response.GruposResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistrarGrupoActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.datos)
    TextView datos;
    @BindView(R.id.editText)
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_grupo);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        obtenerDatosResponsables();
    }

    private void obtenerDatosResponsables() {
        //Call<GruposResponse> call = ApiAdapter.getApiService().getGrupos();
        String num = editText.getText().toString();
        Call<GruposResponse> call = ApiAdapter.getApiService().getGrupos(num);
        //Log.e(getLocalClassName(), "entrooo  xd");
        call.enqueue(new GruposCallBack());

    }

    class GruposCallBack implements Callback<GruposResponse> {
        @Override
        public void onResponse(Call<GruposResponse> call, Response<GruposResponse> response) {
            if (response.isSuccessful()) {
                GruposResponse gruposResponse = response.body();


                poblarSpinnerGrupos(gruposResponse);

            } else {
                Toast.makeText(getApplication(), "Error en el formato de respuesta", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onFailure(Call<GruposResponse> call, Throwable t) {
            Toast.makeText(getApplication(), "Error en conexion", Toast.LENGTH_SHORT).show();
        }

    }

    private void poblarSpinnerGrupos(GruposResponse data) {

        /*
        List<String> list = new ArrayList<String>();

        DataIterator cp = new DataIterator(data);

        //Iterator <Data> =  cp.iterator();
        Iterator<Data> it1 = cp.iterator();

        while (it1.hasNext()){

            Data tmp = it1.next();
            list.add(tmp.getAttributes().getGroupName());
            */

        datos.setText("director" + data.getData().getAttributes().getGroupDirector() +
                "grupo" + data.getData().getAttributes().getGroupName()
        );
        Log.e(getLocalClassName(), "eeentrooo" + data.getData().getAttributes().getGroupDirector());

    }

        /*
        for (Data r: data) {
            list.add(r.getGroupName());
        }*/

    // ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(getContext(),, list);
    // spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    //spinnerGrupos.setAdapter(spinnerArrayAdapter);
    //    }
}

