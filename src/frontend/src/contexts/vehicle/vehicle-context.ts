import { UseQueryResult } from "@tanstack/react-query";
import { createContext, useContext } from "react";
import GetVehiclesDto from "../../api/dto/get-vehicles-dto";
import noop from "../../utils/noop";

export type VehicleContextValue = {
  query: UseQueryResult<GetVehiclesDto, Error> | null;
  refetchVehicles: () => void;
};

const VehicleContext = createContext<VehicleContextValue>({
  query: null,
  refetchVehicles: noop,
});

export const useVehicleContext = () => useContext(VehicleContext);

export default VehicleContext;
