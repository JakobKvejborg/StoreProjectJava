package controller;

import model.Lease;
import model.LendableIF;

/**
 * @author Jakob
 *
 *@version 14/12/2023
 *@since 14/12/2023
 */

public interface LeaseCtrlIF {

public LendableIF addTools(String barcode);
public Lease makeLease();
public Lease completeLease(double payment);


}

