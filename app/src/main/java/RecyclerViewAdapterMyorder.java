import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerView_adapter_myorder extends RecyclerView.Adapter<RecyclerViewAdapterMyorder.MyViewHolder> {
    @NonNull
    @Override
    public RecyclerViewAdapterMyorder.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.myordercard, parent, false);
        return new RecyclerViewAdapterMyorder.MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterMyorder.MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
