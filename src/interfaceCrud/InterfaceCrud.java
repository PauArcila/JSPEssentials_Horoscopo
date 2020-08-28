package interfaceCrud;

import java.util.List;

public interface InterfaceCrud <LoQueSea>{
	
	public boolean create(LoQueSea lqs);
	public boolean delete(Object key);
	public boolean update(LoQueSea lqs);
	public LoQueSea read(Object key);
	public List<LoQueSea> readAll();

}
