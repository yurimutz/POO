import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;


public class App {
    public static void main(String[] args) throws Exception {
        Material material = new Material(10.0);
        Material material2 = new Material(5.0);
        Material material3 = new Material(3.0);

        //Array normal;
        Material[] materialVet = new Material[2];
        materialVet[0] = material;
        materialVet[1] = material2;

        for (int i = 0; i < 2; i++){
            System.out.println(materialVet[i].getPreco());
        }
        System.out.println("\n");

        //Array mas com forma de lista, se arruma sozinho;
        List<Material> materialArray = new ArrayList<Material>();
        materialArray.add(material);
        materialArray.add(material2);
        materialArray.add(material3);

        for (int i = 0; i < materialArray.size(); i++){
            System.out.println(materialArray.get(i).getPreco());
        }
        System.out.println("\n");

        materialArray.remove(0);

        System.out.println("elemento 0 removido, nao preciso rearranjar");
        for (int i = 0; i < materialArray.size(); i++){
            System.out.println(materialArray.get(i).getPreco());
        }
        System.out.println("\n");


        //Lista encadeada;
        List<Material> materialList = new LinkedList<Material>();
        materialList.add(material3);
        for (int i = 0; i < materialList.size(); i++){
            System.out.println(materialList.get(i).getPreco());
        }
        System.out.println("\n");

        //hashset e iterator;
        Set<Material> setMaterial = new HashSet<Material>();
        setMaterial.add(material2);
        setMaterial.add(material3);
        setMaterial.add(material);

        Iterator<Material> iterator = setMaterial.iterator();

        System.out.println("colecao/iterator");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getPreco());
        }

        //com arvore de decisao (ver a Material pois teve mudancas la);
        Set<Material> clientesTree = new TreeSet<Material>();
        clientesTree.add(material3);
        clientesTree.add(material);
        clientesTree.add(material2);
      
        while(iterator.hasNext()){
            System.out.println(iterator.next().getPreco());
        }

        //Map
        Map<Double, Material> mapMaterial = new HashMap<>();
        mapMaterial.put(material.getPreco(), material);
        mapMaterial.put(material2.getPreco(), material2);
    }
}
