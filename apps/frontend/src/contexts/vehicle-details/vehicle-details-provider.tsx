import { PropsWithChildren } from "react";
import VehicleDetailsContext from "./vehicle-details-context";
import { useQuery, useQueryClient } from "@tanstack/react-query";
import { useParams } from "react-router-dom";
import getVehicleById from "../../api/get-vehicle-by-id";

const VehicleDetailsProvider = ({ children }: PropsWithChildren) => {
  const { id } = useParams();

  const queryClient = useQueryClient();

  const query = useQuery({
    queryKey: ["vehicles", { id }],
    queryFn: () => getVehicleById(id!),
  });

  const refetchVehicleDetails = () =>
    queryClient.invalidateQueries({ queryKey: ["vehicles", { id }] });

  return (
    <VehicleDetailsContext.Provider value={{ query, refetchVehicleDetails }}>
      {children}
    </VehicleDetailsContext.Provider>
  );
};

export default VehicleDetailsProvider;
