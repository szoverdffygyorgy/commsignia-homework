import { UseQueryResult } from "@tanstack/react-query";
import { createContext, useContext } from "react";
import VehicleDetailsDto from "../../api/dto/vehicle-details-dto";
import noop from "../../utils/noop";

export type VehicleDetailsContextValue = {
  query: UseQueryResult<VehicleDetailsDto> | null;
  refetchVehicleDetails: () => void;
};

const VehicleDetailsContext = createContext<VehicleDetailsContextValue>({
  query: null,
  refetchVehicleDetails: noop,
});

export const useVehicleDetailsContext = () => useContext(VehicleDetailsContext);

export default VehicleDetailsContext;
