package mx.com.finsol.captura_de_prospecto_2.capturadeprospecto2.ui.fragments;

import android.content.Context;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import mx.com.finsol.captura_de_prospecto_2.capturadeprospecto2.R;
import mx.com.finsol.captura_de_prospecto_2.capturadeprospecto2.databinding.FragmentClientDataBinding;
import mx.com.finsol.captura_de_prospecto_2.capturadeprospecto2.models.Prospecto;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ClientDataFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ClientDataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClientDataFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;


    //Vars
    private Prospecto mProspecto;
    private EditText txtProsctoApellPat;
    public ClientDataFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClientDataFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ClientDataFragment newInstance(String param1, String param2) {
        ClientDataFragment fragment = new ClientDataFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //FragmentClientDataBinding binding= DataBindingUtil.inflate(inflater,R.layout.fragment_client_data,container,false);
        //View view = binding.getRoot();




        //binding.setDatosCliente(mProspecto= new Prospecto());

        View view = inflater.inflate(R.layout.fragment_client_data, container, false);

        return view;
    }

    private void bindUi(View view){
        txtProsctoApellPat=(EditText)view.findViewById(R.id.editText_prospect_father_lastname);
    }
    /*public View onCreateView(LayoutInflater inflater,
                         @Nullable ViewGroup container,
                         @Nullable Bundle savedInstanceState) {
    MartianDataBinding binding = DataBindingUtil.inflate(
            inflater, R.layout.martian_data, container, false);
    View view = binding.getRoot();
    //here data must be an instance of the class MarsDataProvider
    binding.setMarsdata(data);
    return view;
}*/

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
