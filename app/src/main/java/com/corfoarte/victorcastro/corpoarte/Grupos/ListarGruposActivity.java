package com.corfoarte.victorcastro.corpoarte.Grupos;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.corfoarte.victorcastro.corpoarte.R;
import com.corfoarte.victorcastro.corpoarte.io.ApiAdapter;
import com.corfoarte.victorcastro.corpoarte.io.CrearGrupos.Bagpipe;
import com.corfoarte.victorcastro.corpoarte.io.CrearGrupos.CustomOnItemSelectedListener;
import com.corfoarte.victorcastro.corpoarte.io.CrearGrupos.Grupos;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListarGruposActivity extends AppCompatActivity {
    private ProgressDialog progressDialog;
    @BindView(R.id.group_category)
    Spinner groupCategory;
    @BindView(R.id.group_name)
    EditText groupName;
    @BindView(R.id.group_director)
    EditText groupDirector;
    @BindView(R.id.city)
    EditText city;
    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.department)
    EditText department;
    @BindView(R.id.email)
    EditText email;
    @BindView(R.id.enviar)
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_grupos);
        ButterKnife.bind(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        groupCategory.setAdapter(adapter);
        groupCategory.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        progressDialog = new ProgressDialog(this);
    }


    @OnClick(R.id.enviar)
    public void onViewClicked() {
        String spinner = groupCategory.getSelectedItem().toString();

        progressDialog.setMessage("Iniciado Creacion");
        //muestras el ProgressDialog
        progressDialog.show();
        Grupos grupoLlenado = llenadoObjeto();

        Call<Grupos> call = ApiAdapter.getApiService().postGrupo(grupoLlenado);
        Log.e(getLocalClassName(), "entrooo  xd");
        call.enqueue(new GruposPostCallBack());


    }

    private Grupos llenadoObjeto() {

        String categoria = groupCategory.getSelectedItem().toString();
        Grupos grupo = new Grupos();
        Bagpipe bagpipe = new Bagpipe();
        String hola = "";

        bagpipe.setGroupName(groupName.getText().toString());
        bagpipe.setGroupDirector(groupDirector.getText().toString());
        bagpipe.setGroupCategory(categoria);
        bagpipe.setCity(city.getText().toString());
        bagpipe.setDepartment(department.getText().toString());
        bagpipe.setEmail(email.getText().toString());
        grupo.setBagpipe(bagpipe);

        return grupo;
    }


    protected class GruposPostCallBack implements Callback<Grupos> {


        @Override
        public void onResponse(Call<Grupos> call, Response<Grupos> response) {
            if (response.isSuccessful()) {
                progressDialog.dismiss();
                Log.i("Sesion", "Exito en el inicio de sesion");
                Grupos grupos = response.body();
                Toast.makeText(getApplication(), "Usuario Registrado ok", Toast.LENGTH_SHORT).show();

//                poblarSpinnerGrupos(gruposResponse);

            } else {
                Toast.makeText(getApplication(), "Error en el formato de respuesta", Toast.LENGTH_SHORT).show();
            }
        }

        @Override
        public void onFailure(Call<Grupos> call, Throwable t) {
            Toast.makeText(getApplication(), "Error en conexion", Toast.LENGTH_SHORT).show();
        }
    }


}
