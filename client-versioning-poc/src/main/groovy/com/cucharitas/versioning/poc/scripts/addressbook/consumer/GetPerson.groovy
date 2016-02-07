package be.cipal.poc.scripts.addressbook.consumer

import be.cipal.poc.v1.addressbook.AddressbookProvider
import be.cipal.poc.v1.addressbook.GetAddress
import be.cipal.poc.v1.addressbook.AddressRequestV10
import be.cipal.poc.v1.addressbook.AddressResponseV10

final String name = args ? args[0] : 'FN 1'

GetAddress ga = new GetAddress()
AddressbookProvider provider =  ga.getGetAddressPort()
println "GetPerson --- using $args as request parameter"
AddressRequestV10 req = new AddressRequestV10()
req.setName(name)
AddressResponseV10 response = provider.getAddress(req)

println """
\tPerson data:
\tFirstName: ${response?.getPerson()?.firstName}
\tlasttName: ${response?.getPerson()?.lastName}
\tid: ${response?.getPerson()?.idn}
"""
