import { PropsWithChildren } from "react";
import VehicleContext from "./vehicle-context";
import getVehicles from "../../api/get-vehicles";
import { useQuery, useQueryClient } from "@tanstack/react-query";

const VehicleProvider = ({ children }: PropsWithChildren) => {
  const queryClient = useQueryClient();

  const query = useQuery({
    queryKey: ["vehicles"],
    queryFn: () => getVehicles(),
  });

  const refetchVehicles = () =>
    queryClient.invalidateQueries({ queryKey: ["vehicles"] });

  return (
    <VehicleContext.Provider
      value={{
        query,
        refetchVehicles,
      }}
    >
      {children}
    </VehicleContext.Provider>
  );
};

export default VehicleProvider;
