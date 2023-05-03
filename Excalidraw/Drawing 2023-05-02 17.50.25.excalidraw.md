---

excalidraw-plugin: parsed
tags: [excalidraw]

---
==⚠  Switch to EXCALIDRAW VIEW in the MORE OPTIONS menu of this document. ⚠==


# Text Elements
example 1 ^3s6H45oR

VM Polo ^cbnGDyqu

- [ ] Child Seat
- [ ] GPS
- [ ] Roof rack ^1lhd7o8D

extras ^avbpc9SX

Toyota Auris ^N8y3cw0O

- [ ] GPS ^4mmBcXfn

BOOK ^N8cznEzt

Connection
to database ^9QsbIIUM

reservations ^FTR4gbph

reservations_number ^Z0wzyGRR

customer_id ^fRA3hGfQ

car_id ^xZLP2Hg6

date_in ^HwSU0dVA

date_out ^QjZXRli1

extras ^n07Hxdry

date_out ^JOZ6XKSv

date_in ^jiUL5H91

Check avalibility ^4SBp5nrF

HTML Form ^EHdkhdUS

- [ ] ... ^ynUtbtIh

Toyota Auris ^euo6UEfm

- [ ] ... ^mkvC9q7D

- [ ] ... ^K2u2UDfg

- [ ] ... ^qwkUSHYh

VW Polo ^oYefKhii

BOOK ^3vknpr7B

BOOK ^iaa1eKEW

$sql = "INSERT INTO reservations ..." ^EshXE5xW

$sql = "SELECT ..." ^HqQ8PDYt

// $sql = "INSERT INTO..." ^jH30e78m

JSON in MariaDb -> Save in a variable as a LONG VARCHAR ^1gV30wVk

// Save info into variables, before
INSERT INTO ^Tq4ECbjK

POST ^HgO63MI0

POST ^aTuZEtlw

$reservation_number (GENERATE IT)
$customer_id = FROM the $_SESSION variable
$car_id = $_POST['car_id'];
$date_in = $_POST['date_in'];
$date_out = $_POST['date_out'];
$extras_array = $_POST['extras'];

$extras_json = json_encode ($extras-array); ^YZeTBBvY

INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)
VALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json'); ^VVFp84cf

from json to ARRAY ^1sEnK5kc

$extras_json

$extras_array = json_decode($extras_json) ^neV0r74m

from ARRAY to json
(SQL can't save arrays) ^NYwqXhYh

APUNTES SQL + JSON ^nDIl9vLl

[ 
    {
        "name" : "Google",
        "numberEmployees" : 354,
        "ceo" : "John Smith"
    },

    {
        "name" : "Amazon",
        "numberEmployees" : 512,
        "ceo" : "Jeff Smith"
    }
] ^ePCHI0yi

PHP ^tfMbc1Xd

$companies = json_decode(companies_json);
echo $companies[0]['name']; ^k2ZZqBtY

$ = root (principio del documento JSON) ^wIt4g0te

SELECT JSON_EXTRACT(companies, '$[0].name')
FROM info; ^a1PaF707

SQL ^mNMefL72

JS ^tzxag6xQ

let companies = JSON.parse(companies_json);
console.log(companies[0].name); ^RUE4cMLs

Google ^oDYhybRj

Google ^M82reCfw

Google ^LMFu4Sdh

JSON File ^CL8gdyWI

%%
# Drawing
```json
{
	"type": "excalidraw",
	"version": 2,
	"source": "https://github.com/zsviczian/obsidian-excalidraw-plugin/releases/tag/1.8.26",
	"elements": [
		{
			"type": "text",
			"version": 12,
			"versionNonce": 844782747,
			"isDeleted": false,
			"id": "3s6H45oR",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -316.4738464355469,
			"y": -198.00739288330078,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 89.65992736816406,
			"height": 25,
			"seed": 1773113801,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460108,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "example 1",
			"rawText": "example 1",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "example 1",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 38,
			"versionNonce": 2088472213,
			"isDeleted": false,
			"id": "FqywXyxkXa_4_PKwfS6p-",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -306.4322204589844,
			"y": -141.4094009399414,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 157.9266357421875,
			"height": 143.32070922851562,
			"seed": 1237575433,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 22,
			"versionNonce": 1169822011,
			"isDeleted": false,
			"id": "cbnGDyqu",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -106.51351928710938,
			"y": -128.62921905517578,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 76.29994201660156,
			"height": 25,
			"seed": 2836169,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "VM Polo",
			"rawText": "VM Polo",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "VM Polo",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 73,
			"versionNonce": 395768821,
			"isDeleted": false,
			"id": "1lhd7o8D",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -107.42642211914062,
			"y": -91.2015151977539,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 159.5598907470703,
			"height": 75,
			"seed": 276752457,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] Child Seat\n- [ ] GPS\n- [ ] Roof rack",
			"rawText": "- [ ] Child Seat\n- [ ] GPS\n- [ ] Roof rack",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] Child Seat\n- [ ] GPS\n- [ ] Roof rack",
			"lineHeight": 1.25,
			"baseline": 67
		},
		{
			"type": "freedraw",
			"version": 84,
			"versionNonce": 142225883,
			"isDeleted": false,
			"id": "ts0oJyuJVzC9piubxS4uP",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 90.66665649414062,
			"y": -147.79950714111328,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 53.859375,
			"height": 166.14251708984375,
			"seed": 1421719209,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0.912841796875,
					0
				],
				[
					6.3900146484375,
					0
				],
				[
					11.8673095703125,
					0.912872314453125
				],
				[
					16.431640625,
					2.738616943359375
				],
				[
					20.0831298828125,
					4.564361572265625
				],
				[
					21.9088134765625,
					5.47723388671875
				],
				[
					22.8216552734375,
					8.215850830078125
				],
				[
					23.734619140625,
					11.867340087890625
				],
				[
					23.734619140625,
					13.69305419921875
				],
				[
					23.734619140625,
					18.257415771484375
				],
				[
					23.734619140625,
					20.99603271484375
				],
				[
					23.734619140625,
					23.734649658203125
				],
				[
					23.734619140625,
					26.4732666015625
				],
				[
					22.8216552734375,
					30.124755859375
				],
				[
					21.9088134765625,
					33.776214599609375
				],
				[
					18.25732421875,
					39.253448486328125
				],
				[
					18.25732421875,
					43.81781005859375
				],
				[
					16.431640625,
					47.46929931640625
				],
				[
					11.8673095703125,
					54.772247314453125
				],
				[
					10.954345703125,
					58.423736572265625
				],
				[
					10.954345703125,
					61.162353515625
				],
				[
					10.954345703125,
					63.900970458984375
				],
				[
					10.954345703125,
					64.8138427734375
				],
				[
					10.954345703125,
					67.55245971679688
				],
				[
					10.954345703125,
					68.46533203125
				],
				[
					10.04150390625,
					71.20394897460938
				],
				[
					10.04150390625,
					73.94253540039062
				],
				[
					10.04150390625,
					76.68115234375
				],
				[
					10.04150390625,
					78.50689697265625
				],
				[
					10.04150390625,
					80.3326416015625
				],
				[
					10.954345703125,
					82.15838623046875
				],
				[
					12.7801513671875,
					83.07125854492188
				],
				[
					13.6929931640625,
					84.89700317382812
				],
				[
					14.6058349609375,
					85.80987548828125
				],
				[
					16.431640625,
					86.72274780273438
				],
				[
					19.1702880859375,
					86.72274780273438
				],
				[
					20.9959716796875,
					86.72274780273438
				],
				[
					23.734619140625,
					87.6356201171875
				],
				[
					24.6474609375,
					88.54849243164062
				],
				[
					22.8216552734375,
					90.37423706054688
				],
				[
					22.8216552734375,
					91.287109375
				],
				[
					22.8216552734375,
					93.11282348632812
				],
				[
					21.9088134765625,
					94.02569580078125
				],
				[
					21.9088134765625,
					96.76431274414062
				],
				[
					20.9959716796875,
					98.59005737304688
				],
				[
					20.9959716796875,
					101.32867431640625
				],
				[
					20.0831298828125,
					103.1544189453125
				],
				[
					20.0831298828125,
					104.98016357421875
				],
				[
					19.1702880859375,
					107.71878051757812
				],
				[
					19.1702880859375,
					109.54452514648438
				],
				[
					19.1702880859375,
					112.28311157226562
				],
				[
					19.1702880859375,
					116.84747314453125
				],
				[
					19.1702880859375,
					119.58609008789062
				],
				[
					19.1702880859375,
					122.32470703125
				],
				[
					19.1702880859375,
					125.9761962890625
				],
				[
					19.1702880859375,
					128.71481323242188
				],
				[
					19.1702880859375,
					132.36627197265625
				],
				[
					17.344482421875,
					136.01776123046875
				],
				[
					16.431640625,
					140.58212280273438
				],
				[
					16.431640625,
					143.32073974609375
				],
				[
					15.518798828125,
					146.97222900390625
				],
				[
					13.6929931640625,
					150.62368774414062
				],
				[
					12.7801513671875,
					155.18804931640625
				],
				[
					10.954345703125,
					157.92666625976562
				],
				[
					9.128662109375,
					160.665283203125
				],
				[
					6.3900146484375,
					162.49102783203125
				],
				[
					3.6513671875,
					164.3167724609375
				],
				[
					-1.8258056640625,
					166.14251708984375
				],
				[
					-2.7386474609375,
					166.14251708984375
				],
				[
					-7.302978515625,
					166.14251708984375
				],
				[
					-11.867431640625,
					166.14251708984375
				],
				[
					-16.4317626953125,
					166.14251708984375
				],
				[
					-20.99609375,
					166.14251708984375
				],
				[
					-22.82177734375,
					166.14251708984375
				],
				[
					-23.7347412109375,
					166.14251708984375
				],
				[
					-25.5604248046875,
					166.14251708984375
				],
				[
					-27.38623046875,
					166.14251708984375
				],
				[
					-28.299072265625,
					166.14251708984375
				],
				[
					-29.2119140625,
					166.14251708984375
				],
				[
					-29.2119140625,
					166.14251708984375
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "text",
			"version": 23,
			"versionNonce": 2027859285,
			"isDeleted": false,
			"id": "avbpc9SX",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 138.13589477539062,
			"y": -80.2470474243164,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 66.27993774414062,
			"height": 25,
			"seed": 238075017,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "extras",
			"rawText": "extras",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "extras",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 104,
			"versionNonce": 195903099,
			"isDeleted": false,
			"id": "heQiQZ4NyqrLorWV-Fxfu",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -308.1024627685547,
			"y": 57.43334197998047,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 157.9266357421875,
			"height": 143.32070922851562,
			"seed": 1237575433,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 100,
			"versionNonce": 1067989685,
			"isDeleted": false,
			"id": "N8y3cw0O",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -108.18376159667969,
			"y": 70.2135238647461,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 130.5798797607422,
			"height": 25,
			"seed": 2836169,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Toyota Auris",
			"rawText": "Toyota Auris",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Toyota Auris",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 146,
			"versionNonce": 437630747,
			"isDeleted": false,
			"id": "4mmBcXfn",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -109.09666442871094,
			"y": 107.64122772216797,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 99.199951171875,
			"height": 25,
			"seed": 276752457,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] GPS",
			"rawText": "- [ ] GPS",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] GPS",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 33,
			"versionNonce": 77143061,
			"isDeleted": false,
			"id": "oYLgVqAUAYxDKzbfnSIre",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -178.94717407226562,
			"y": 245.18450164794922,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 133,
			"height": 43,
			"seed": 229374197,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "3vknpr7B"
				}
			],
			"updated": 1683136460109,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 19,
			"versionNonce": 36051899,
			"isDeleted": false,
			"id": "3vknpr7B",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -140.36715698242188,
			"y": 254.18450164794922,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 55.8399658203125,
			"height": 25,
			"seed": 1342902869,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460109,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "BOOK",
			"rawText": "BOOK",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "oYLgVqAUAYxDKzbfnSIre",
			"originalText": "BOOK",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "freedraw",
			"version": 63,
			"versionNonce": 799461749,
			"isDeleted": false,
			"id": "Ive4cG8EvyXM6X4QR-G7p",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 88.84085083007812,
			"y": 335.6062545776367,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 84.89697265625,
			"height": 194.44146728515625,
			"seed": 1987385321,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					-0.912841796875
				],
				[
					3.6514892578125,
					-9.12872314453125
				],
				[
					10.9544677734375,
					-19.1702880859375
				],
				[
					17.3446044921875,
					-30.12469482421875
				],
				[
					22.82177734375,
					-41.9920654296875
				],
				[
					24.6474609375,
					-48.38214111328125
				],
				[
					24.6474609375,
					-57.5108642578125
				],
				[
					22.82177734375,
					-67.55242919921875
				],
				[
					20.0831298828125,
					-78.50689697265625
				],
				[
					15.518798828125,
					-94.93853759765625
				],
				[
					9.128662109375,
					-106.805908203125
				],
				[
					2.7386474609375,
					-116.84747314453125
				],
				[
					-1.82568359375,
					-125.06329345703125
				],
				[
					-8.2158203125,
					-133.27911376953125
				],
				[
					-12.7801513671875,
					-139.66925048828125
				],
				[
					-16.431640625,
					-146.97216796875
				],
				[
					-20.9959716796875,
					-153.3623046875
				],
				[
					-28.2989501953125,
					-161.578125
				],
				[
					-32.8634033203125,
					-166.1424560546875
				],
				[
					-35.6019287109375,
					-169.7939453125
				],
				[
					-37.427734375,
					-172.5325927734375
				],
				[
					-40.166259765625,
					-177.096923828125
				],
				[
					-43.8177490234375,
					-180.7484130859375
				],
				[
					-47.46923828125,
					-184.39990234375
				],
				[
					-51.1207275390625,
					-188.0513916015625
				],
				[
					-53.859375,
					-189.87713623046875
				],
				[
					-55.6851806640625,
					-190.78997802734375
				],
				[
					-55.6851806640625,
					-189.87713623046875
				],
				[
					-55.6851806640625,
					-180.7484130859375
				],
				[
					-55.6851806640625,
					-177.096923828125
				],
				[
					-55.6851806640625,
					-174.35833740234375
				],
				[
					-55.6851806640625,
					-172.5325927734375
				],
				[
					-55.6851806640625,
					-170.70684814453125
				],
				[
					-55.6851806640625,
					-166.1424560546875
				],
				[
					-54.772216796875,
					-164.3167724609375
				],
				[
					-54.772216796875,
					-162.49102783203125
				],
				[
					-55.6851806640625,
					-162.49102783203125
				],
				[
					-56.5980224609375,
					-164.3167724609375
				],
				[
					-56.5980224609375,
					-168.881103515625
				],
				[
					-56.5980224609375,
					-175.27117919921875
				],
				[
					-57.5108642578125,
					-178.92266845703125
				],
				[
					-58.4237060546875,
					-181.66131591796875
				],
				[
					-58.4237060546875,
					-182.57415771484375
				],
				[
					-58.4237060546875,
					-184.39990234375
				],
				[
					-59.3365478515625,
					-186.22564697265625
				],
				[
					-59.3365478515625,
					-188.0513916015625
				],
				[
					-59.3365478515625,
					-190.78997802734375
				],
				[
					-60.24951171875,
					-192.61572265625
				],
				[
					-60.24951171875,
					-193.52862548828125
				],
				[
					-59.3365478515625,
					-194.44146728515625
				],
				[
					-52.03369140625,
					-194.44146728515625
				],
				[
					-48.3822021484375,
					-194.44146728515625
				],
				[
					-46.556396484375,
					-194.44146728515625
				],
				[
					-44.730712890625,
					-194.44146728515625
				],
				[
					-43.8177490234375,
					-194.44146728515625
				],
				[
					-42.9049072265625,
					-194.44146728515625
				],
				[
					-41.9920654296875,
					-194.44146728515625
				],
				[
					-41.9920654296875,
					-194.44146728515625
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 14,
			"versionNonce": 536931419,
			"isDeleted": false,
			"id": "NoIMJRwoA9JiDUaCKrS9x",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 41.371612548828125,
			"y": 255.27361297607422,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 0.912841796875,
			"height": 28.29901123046875,
			"seed": 1502472745,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					1.82574462890625
				],
				[
					0,
					8.21588134765625
				],
				[
					0,
					13.69305419921875
				],
				[
					0,
					18.2574462890625
				],
				[
					0,
					22.82177734375
				],
				[
					0,
					25.5604248046875
				],
				[
					0.912841796875,
					27.38616943359375
				],
				[
					0.912841796875,
					28.29901123046875
				],
				[
					0.912841796875,
					28.29901123046875
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 13,
			"versionNonce": 236378837,
			"isDeleted": false,
			"id": "488mmEDJCr6Ge1dquBnu4",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 31.329986572265625,
			"y": 273.5310592651367,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 23.734619140625,
			"height": 2.7386474609375,
			"seed": 696940679,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					1.82568359375,
					0
				],
				[
					10.9544677734375,
					0
				],
				[
					15.518798828125,
					-0.91290283203125
				],
				[
					19.1702880859375,
					-2.7386474609375
				],
				[
					20.99609375,
					-2.7386474609375
				],
				[
					21.908935546875,
					-2.7386474609375
				],
				[
					23.734619140625,
					-2.7386474609375
				],
				[
					23.734619140625,
					-2.7386474609375
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 63,
			"versionNonce": 662219003,
			"isDeleted": false,
			"id": "0h2THZqXlbwLYSnRDDlbS",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 53.238922119140625,
			"y": 336.51915740966797,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 93.11285400390625,
			"height": 37.427734375,
			"seed": 1739277351,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					-0.912841796875,
					0.912841796875
				],
				[
					-2.7386474609375,
					1.82574462890625
				],
				[
					-8.2158203125,
					4.5643310546875
				],
				[
					-14.60595703125,
					5.47723388671875
				],
				[
					-20.083251953125,
					5.47723388671875
				],
				[
					-28.299072265625,
					8.2158203125
				],
				[
					-35.60205078125,
					8.2158203125
				],
				[
					-43.81787109375,
					8.2158203125
				],
				[
					-51.12078857421875,
					8.2158203125
				],
				[
					-56.5980224609375,
					8.2158203125
				],
				[
					-58.42376708984375,
					8.2158203125
				],
				[
					-61.162353515625,
					8.2158203125
				],
				[
					-63.9010009765625,
					8.2158203125
				],
				[
					-68.46533203125,
					6.39007568359375
				],
				[
					-71.2039794921875,
					4.5643310546875
				],
				[
					-73.02972412109375,
					3.6514892578125
				],
				[
					-73.94256591796875,
					1.82574462890625
				],
				[
					-76.68121337890625,
					-0.91290283203125
				],
				[
					-78.5069580078125,
					-5.47723388671875
				],
				[
					-80.3326416015625,
					-8.21588134765625
				],
				[
					-81.24554443359375,
					-10.0416259765625
				],
				[
					-83.0712890625,
					-11.8673095703125
				],
				[
					-83.984130859375,
					-14.60595703125
				],
				[
					-84.89703369140625,
					-16.43170166015625
				],
				[
					-86.7227783203125,
					-18.2574462890625
				],
				[
					-87.6356201171875,
					-20.08319091796875
				],
				[
					-89.46136474609375,
					-22.82177734375
				],
				[
					-90.374267578125,
					-23.73468017578125
				],
				[
					-91.287109375,
					-25.5604248046875
				],
				[
					-91.287109375,
					-26.4732666015625
				],
				[
					-92.20001220703125,
					-26.4732666015625
				],
				[
					-92.20001220703125,
					-25.5604248046875
				],
				[
					-93.11285400390625,
					-23.73468017578125
				],
				[
					-93.11285400390625,
					-20.99603271484375
				],
				[
					-93.11285400390625,
					-19.1702880859375
				],
				[
					-93.11285400390625,
					-18.2574462890625
				],
				[
					-93.11285400390625,
					-17.34454345703125
				],
				[
					-93.11285400390625,
					-16.43170166015625
				],
				[
					-93.11285400390625,
					-14.60595703125
				],
				[
					-93.11285400390625,
					-12.78021240234375
				],
				[
					-93.11285400390625,
					-9.12872314453125
				],
				[
					-93.11285400390625,
					-10.0416259765625
				],
				[
					-93.11285400390625,
					-13.69305419921875
				],
				[
					-93.11285400390625,
					-17.34454345703125
				],
				[
					-93.11285400390625,
					-20.99603271484375
				],
				[
					-93.11285400390625,
					-22.82177734375
				],
				[
					-93.11285400390625,
					-23.73468017578125
				],
				[
					-93.11285400390625,
					-24.64752197265625
				],
				[
					-93.11285400390625,
					-25.5604248046875
				],
				[
					-93.11285400390625,
					-26.4732666015625
				],
				[
					-93.11285400390625,
					-27.38616943359375
				],
				[
					-93.11285400390625,
					-28.29901123046875
				],
				[
					-93.11285400390625,
					-29.2119140625
				],
				[
					-91.287109375,
					-29.2119140625
				],
				[
					-81.24554443359375,
					-29.2119140625
				],
				[
					-80.3326416015625,
					-29.2119140625
				],
				[
					-78.5069580078125,
					-28.29901123046875
				],
				[
					-78.5069580078125,
					-28.29901123046875
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 41,
			"versionNonce": 679393333,
			"isDeleted": false,
			"id": "87PWeEfgUOFQisqwAV4Dh",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 94.31802368164062,
			"y": 359.4221725463867,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 166.142578125,
			"height": 86.72271728515625,
			"seed": 773518823,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					2.7386474609375
				],
				[
					0,
					5.47723388671875
				],
				[
					0.9129638671875,
					10.0416259765625
				],
				[
					4.564453125,
					13.69305419921875
				],
				[
					8.2159423828125,
					20.08319091796875
				],
				[
					12.7802734375,
					23.73468017578125
				],
				[
					15.5189208984375,
					27.38616943359375
				],
				[
					20.083251953125,
					31.03759765625
				],
				[
					26.4732666015625,
					34.6890869140625
				],
				[
					31.9505615234375,
					37.427734375
				],
				[
					37.427734375,
					40.16632080078125
				],
				[
					42.905029296875,
					41.9920654296875
				],
				[
					51.120849609375,
					45.6435546875
				],
				[
					59.336669921875,
					46.55645751953125
				],
				[
					67.552490234375,
					49.2950439453125
				],
				[
					75.768310546875,
					50.2078857421875
				],
				[
					87.6356201171875,
					50.2078857421875
				],
				[
					95.8514404296875,
					50.2078857421875
				],
				[
					104.0673828125,
					47.46929931640625
				],
				[
					111.370361328125,
					45.6435546875
				],
				[
					117.7603759765625,
					41.9920654296875
				],
				[
					125.9761962890625,
					35.60198974609375
				],
				[
					135.10498046875,
					27.38616943359375
				],
				[
					143.32080078125,
					17.34454345703125
				],
				[
					152.449462890625,
					8.21588134765625
				],
				[
					155.1881103515625,
					2.7386474609375
				],
				[
					157.9267578125,
					-3.6514892578125
				],
				[
					159.75244140625,
					-10.04156494140625
				],
				[
					159.75244140625,
					-14.60589599609375
				],
				[
					162.4910888671875,
					-20.99603271484375
				],
				[
					163.4039306640625,
					-25.56036376953125
				],
				[
					165.229736328125,
					-31.03759765625
				],
				[
					166.142578125,
					-33.77618408203125
				],
				[
					166.142578125,
					-35.6019287109375
				],
				[
					166.142578125,
					-36.51483154296875
				],
				[
					166.142578125,
					-36.51483154296875
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 19,
			"versionNonce": 772788635,
			"isDeleted": false,
			"id": "R0CwzKcsyBCQ_kH6CAc7a",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 240.37747192382812,
			"y": 317.4301071166992,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 34.6890869140625,
			"height": 40.16632080078125,
			"seed": 1910594887,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					3.6514892578125,
					-0.912841796875
				],
				[
					12.7801513671875,
					-5.477203369140625
				],
				[
					20.9959716796875,
					-8.2158203125
				],
				[
					26.4732666015625,
					-11.8673095703125
				],
				[
					29.2117919921875,
					-12.780181884765625
				],
				[
					31.950439453125,
					-15.518798828125
				],
				[
					31.950439453125,
					-8.2158203125
				],
				[
					31.950439453125,
					-1.825714111328125
				],
				[
					31.03759765625,
					7.302978515625
				],
				[
					31.03759765625,
					13.69305419921875
				],
				[
					31.950439453125,
					20.99603271484375
				],
				[
					33.776123046875,
					22.82177734375
				],
				[
					34.6890869140625,
					24.64752197265625
				],
				[
					34.6890869140625,
					24.64752197265625
				]
			],
			"lastCommittedPoint": null,
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "text",
			"version": 182,
			"versionNonce": 1489234325,
			"isDeleted": false,
			"id": "9QsbIIUM",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 196.42914254324774,
			"y": 180.32181331089566,
			"strokeColor": "#de7b12",
			"backgroundColor": "transparent",
			"width": 228.67193603515625,
			"height": 90,
			"seed": 1594393769,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "Connection\nto database",
			"rawText": "Connection\nto database",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Connection\nto database",
			"lineHeight": 1.25,
			"baseline": 76
		},
		{
			"type": "text",
			"version": 37,
			"versionNonce": 1962468923,
			"isDeleted": false,
			"id": "FTR4gbph",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 459.8141134161699,
			"y": 111.89737058940688,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"width": 217.25990295410156,
			"height": 45,
			"seed": 1251835847,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 36,
			"fontFamily": 1,
			"text": "reservations",
			"rawText": "reservations",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "reservations",
			"lineHeight": 1.25,
			"baseline": 31
		},
		{
			"type": "text",
			"version": 52,
			"versionNonce": 538701557,
			"isDeleted": false,
			"id": "Z0wzyGRR",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 462.096370496248,
			"y": 177.8106854087428,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 200.27980041503906,
			"height": 25,
			"seed": 211191687,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "reservations_number",
			"rawText": "reservations_number",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "reservations_number",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 53,
			"versionNonce": 1930847963,
			"isDeleted": false,
			"id": "fRA3hGfQ",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 709.7124898810137,
			"y": 175.2588055259303,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 119.119873046875,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "customer_id",
			"rawText": "customer_id",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "customer_id",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 75,
			"versionNonce": 1024215125,
			"isDeleted": false,
			"id": "xZLP2Hg6",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 885.1332509894121,
			"y": 172.76895262065688,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 64.25994873046875,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "car_id",
			"rawText": "car_id",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "car_id",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 93,
			"versionNonce": 519754619,
			"isDeleted": false,
			"id": "HwSU0dVA",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 989.6258199591387,
			"y": 172.12045408550063,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 77.19993591308594,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460110,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_in",
			"rawText": "date_in",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_in",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 99,
			"versionNonce": 23754165,
			"isDeleted": false,
			"id": "QjZXRli1",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1104.8386800665605,
			"y": 170.21203733745375,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 97.21990966796875,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_out",
			"rawText": "date_out",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_out",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 104,
			"versionNonce": 2028514331,
			"isDeleted": false,
			"id": "n07Hxdry",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1234.900325574373,
			"y": 167.81099058452406,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 66.27993774414062,
			"height": 25,
			"seed": 1214845641,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "extras",
			"rawText": "extras",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "extras",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 37,
			"versionNonce": 1750857493,
			"isDeleted": false,
			"id": "YoG5re2c0pbDBgdNul5MR",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1220.9202230353105,
			"y": 159.55331541362563,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 92.42813110351562,
			"height": 41.07917785644531,
			"seed": 364350439,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "line",
			"version": 45,
			"versionNonce": 1423077563,
			"isDeleted": false,
			"id": "4cBtRapYA2IWnE21wBWu_",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 463.3180109468616,
			"y": 213.5703151578594,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 208.65618024553578,
			"height": 3.912309919084805,
			"seed": 1548209961,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					208.65618024553578,
					-3.912309919084805
				]
			]
		},
		{
			"type": "line",
			"version": 30,
			"versionNonce": 1817594997,
			"isDeleted": false,
			"id": "yfpacGuOx6F58OrbpUpqF",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 704.5767302548974,
			"y": 212.26621185149787,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 134.322509765625,
			"height": 2.6081630161829708,
			"seed": 415567591,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					134.322509765625,
					2.6081630161829708
				]
			]
		},
		{
			"type": "line",
			"version": 28,
			"versionNonce": 1683661147,
			"isDeleted": false,
			"id": "PEi8R02S8J4sDyxQxutAY",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 876.7180179223081,
			"y": 209.6580052387746,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 99.11185128348234,
			"height": 2.6082066127231656,
			"seed": 878883271,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					99.11185128348234,
					-2.6082066127231656
				]
			]
		},
		{
			"type": "line",
			"version": 34,
			"versionNonce": 488568277,
			"isDeleted": false,
			"id": "nVMZH4t4saTIGehaRH2N2",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 994.0872283017726,
			"y": 203.13748870696662,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 84.76649693080333,
			"height": 1.304103306361526,
			"seed": 1461591945,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					84.76649693080333,
					1.304103306361526
				]
			]
		},
		{
			"type": "line",
			"version": 39,
			"versionNonce": 13876731,
			"isDeleted": false,
			"id": "dkascsmleh5qOMqKyVgFP",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 1097.111258714719,
			"y": 201.83338540060498,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 110.84856305803578,
			"height": 1.3041033063616396,
			"seed": 1679084423,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"boundElements": [],
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"startBinding": null,
			"endBinding": null,
			"lastCommittedPoint": null,
			"startArrowhead": null,
			"endArrowhead": null,
			"points": [
				[
					0,
					0
				],
				[
					110.84856305803578,
					1.3041033063616396
				]
			]
		},
		{
			"type": "rectangle",
			"version": 42,
			"versionNonce": 1976267573,
			"isDeleted": false,
			"id": "uVr_4lZzKOeCa79GKhu-P",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -622.7119507995153,
			"y": 448.7840953614019,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 450.72998046875,
			"height": 393.675537109375,
			"seed": 1589667701,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 45,
			"versionNonce": 893404827,
			"isDeleted": false,
			"id": "jiUL5H91",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -582.7737488952184,
			"y": 487.3113170410894,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 77.19993591308594,
			"height": 25,
			"seed": 575882645,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460111,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_in",
			"rawText": "date_in",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_in",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 51,
			"versionNonce": 1925268629,
			"isDeleted": false,
			"id": "TcFMuDLI1LooHQohvZkZt",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -578.2093873229528,
			"y": 524.0959468628668,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 352.5962829589844,
			"height": 36.51481628417969,
			"seed": 335343541,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 164,
			"versionNonce": 139639611,
			"isDeleted": false,
			"id": "iB-5zljXp2wHbZqTKtU2B",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -579.3505158629919,
			"y": 629.0760722901128,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 352.5962829589844,
			"height": 36.51481628417969,
			"seed": 765434011,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460111,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 93,
			"versionNonce": 1739975157,
			"isDeleted": false,
			"id": "JOZ6XKSv",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -572.5039735045934,
			"y": 590.0092998291753,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 97.21990966796875,
			"height": 25,
			"seed": 1323893141,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "date_out",
			"rawText": "date_out",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "date_out",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 65,
			"versionNonce": 107846619,
			"isDeleted": false,
			"id": "2s6tJroB65bYpkx2eE-YS",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -403.62290050654656,
			"y": 778.5586848999761,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 188.27964782714844,
			"height": 38.79707336425781,
			"seed": 1701279061,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 47,
			"versionNonce": 363782997,
			"isDeleted": false,
			"id": "4SBp5nrF",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -384.63966991572624,
			"y": 786.3882747437261,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 155.11985778808594,
			"height": 25,
			"seed": 1019145909,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "Check avalibility",
			"rawText": "Check avalibility",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Check avalibility",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 38,
			"versionNonce": 195258491,
			"isDeleted": false,
			"id": "EHdkhdUS",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -599.9549055986228,
			"y": 400.6294660627831,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"width": 151.50794982910156,
			"height": 35,
			"seed": 1951752149,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "HTML Form",
			"rawText": "HTML Form",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "HTML Form",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "rectangle",
			"version": 90,
			"versionNonce": 16887989,
			"isDeleted": false,
			"id": "F5OpfFgUZJVSgLdiO9BQV",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -115.4165057660332,
			"y": 446.17588874867863,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 450.72998046875,
			"height": 393.675537109375,
			"seed": 1410152373,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 61,
			"versionNonce": 1303814427,
			"isDeleted": false,
			"id": "Ok2z3eYhffAuOSNPrB9_H",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -69.72928381507836,
			"y": 486.0909305965132,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 165.1861281622023,
			"height": 138.23474702380952,
			"seed": 1978759355,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "rectangle",
			"version": 99,
			"versionNonce": 122933781,
			"isDeleted": false,
			"id": "ZRtZg6eaXxG8F59Pz6egq",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -69.72928381507836,
			"y": 659.1017076612452,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 165.1861281622023,
			"height": 138.23474702380952,
			"seed": 1667432917,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 32,
			"versionNonce": 639223227,
			"isDeleted": false,
			"id": "qwkUSHYh",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 119.80010606587405,
			"y": 524.1281562289537,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 494312245,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 59,
			"versionNonce": 899336053,
			"isDeleted": false,
			"id": "K2u2UDfg",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 120.6695373344752,
			"y": 553.68780210879,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 1628568917,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 87,
			"versionNonce": 468670043,
			"isDeleted": false,
			"id": "ynUtbtIh",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 119.80016419459434,
			"y": 583.2474189242662,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 653725147,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 39,
			"versionNonce": 1578897621,
			"isDeleted": false,
			"id": "oYefKhii",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 118.06124352867164,
			"y": 486.30731475759944,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 106.25997924804688,
			"height": 35,
			"seed": 2094858619,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "VW Polo",
			"rawText": "VW Polo",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "VW Polo",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "text",
			"version": 91,
			"versionNonce": 772395771,
			"isDeleted": false,
			"id": "euo6UEfm",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 115.45306598030857,
			"y": 661.9262693706946,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 182.81192016601562,
			"height": 35,
			"seed": 1101725877,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460112,
			"link": null,
			"locked": false,
			"fontSize": 28,
			"fontFamily": 1,
			"text": "Toyota Auris",
			"rawText": "Toyota Auris",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "Toyota Auris",
			"lineHeight": 1.25,
			"baseline": 25
		},
		{
			"type": "text",
			"version": 78,
			"versionNonce": 1852649013,
			"isDeleted": false,
			"id": "mkvC9q7D",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 118.06130165739194,
			"y": 716.2657236582692,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 74.47996520996094,
			"height": 25,
			"seed": 1656080213,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "- [ ] ...",
			"rawText": "- [ ] ...",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "- [ ] ...",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "rectangle",
			"version": 147,
			"versionNonce": 1558952859,
			"isDeleted": false,
			"id": "ELf2nSPn78QIh--obDQRN",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 212.9918101860627,
			"y": 616.8088075292276,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 82,
			"height": 30,
			"seed": 64563029,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "iaa1eKEW"
				}
			],
			"updated": 1683136460113,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 135,
			"versionNonce": 91463573,
			"isDeleted": false,
			"id": "iaa1eKEW",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 231.655819280301,
			"y": 621.8088075292276,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 44.67198181152344,
			"height": 20,
			"seed": 960722101,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 1,
			"text": "BOOK",
			"rawText": "BOOK",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "ELf2nSPn78QIh--obDQRN",
			"originalText": "BOOK",
			"lineHeight": 1.25,
			"baseline": 14
		},
		{
			"type": "rectangle",
			"version": 186,
			"versionNonce": 1959235643,
			"isDeleted": false,
			"id": "OXGXvzCWUV00feALwqFsy",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 220.83060428414922,
			"y": 784.3627365661006,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 82,
			"height": 30,
			"seed": 2008341609,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": [
				{
					"type": "text",
					"id": "N8cznEzt"
				}
			],
			"updated": 1683136460113,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 175,
			"versionNonce": 1231348981,
			"isDeleted": false,
			"id": "N8cznEzt",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 239.4946133783875,
			"y": 789.3627365661006,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"width": 44.67198181152344,
			"height": 20,
			"seed": 163272743,
			"groupIds": [],
			"roundness": null,
			"boundElements": [],
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 16,
			"fontFamily": 1,
			"text": "BOOK",
			"rawText": "BOOK",
			"textAlign": "center",
			"verticalAlign": "middle",
			"containerId": "OXGXvzCWUV00feALwqFsy",
			"originalText": "BOOK",
			"lineHeight": 1.25,
			"baseline": 14
		},
		{
			"type": "freedraw",
			"version": 144,
			"versionNonce": 394252507,
			"isDeleted": false,
			"id": "lLzpmjb1M-cCj3OZ0zat5",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -302.38525906990196,
			"y": 877.1341670238394,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 312.9927357150202,
			"height": 147.15328713429392,
			"seed": 681421461,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					0,
					3.5036162284792454
				],
				[
					0,
					7.007310542412142
				],
				[
					0,
					14.01454299937052
				],
				[
					0,
					21.02185354178266
				],
				[
					0,
					24.525547855715672
				],
				[
					0,
					29.197088217323767
				],
				[
					0,
					35.036474626606946
				],
				[
					1.1679241331289631,
					38.54009085508619
				],
				[
					3.5036943139330106,
					44.37955534982325
				],
				[
					4.671540361608095,
					50.21894175910643
				],
				[
					5.839464494737058,
					54.89048212071452
				],
				[
					8.175234675541105,
					60.7298685299977
				],
				[
					9.34308072321619,
					64.23356284393071
				],
				[
					9.34308072321619,
					66.56933302473476
				],
				[
					12.846696951695435,
					73.57664356714702
				],
				[
					14.014621084824284,
					77.08025979562615
				],
				[
					16.350391265628332,
					82.9197242903632
				],
				[
					17.51823731330353,
					86.42334051884234
				],
				[
					22.189777674911625,
					92.26272692812552
				],
				[
					25.693471988844635,
					98.10219142286257
				],
				[
					29.197088217323767,
					101.60580765134182
				],
				[
					31.532858398127814,
					105.10950196527483
				],
				[
					35.036552712060825,
					108.61311819375396
				],
				[
					37.37224480741099,
					113.28465855536206
				],
				[
					39.70801498821504,
					115.6204287361661
				],
				[
					43.21170930214805,
					119.12404496464524
				],
				[
					49.051095711431344,
					122.62773927857825
				],
				[
					51.38686589223539,
					124.9635094593823
				],
				[
					56.058406253843486,
					127.29927964018634
				],
				[
					60.72994661545158,
					129.6350498209904
				],
				[
					64.23356284393071,
					131.97082000179444
				],
				[
					72.40879751947182,
					135.47443623027368
				],
				[
					77.08033788107991,
					136.64228227794877
				],
				[
					85.25549447116725,
					141.31382263955686
				],
				[
					92.2628050135794,
					143.6495928203609
				],
				[
					102.77373178447067,
					147.15328713429392
				],
				[
					109.78104232688281,
					147.15328713429392
				],
				[
					117.95619891697015,
					147.15328713429392
				],
				[
					128.4672037733153,
					147.15328713429392
				],
				[
					136.64236036340253,
					147.15328713429392
				],
				[
					145.98544108661883,
					147.15328713429392
				],
				[
					154.16059767670606,
					147.15328713429392
				],
				[
					163.50367839992225,
					144.81751695348987
				],
				[
					170.5109889423344,
					143.6495928203609
				],
				[
					179.8540696655507,
					140.14597659188178
				],
				[
					189.197072303313,
					135.47443623027368
				],
				[
					195.03653679805007,
					133.13866604946963
				],
				[
					200.87592320733324,
					129.6350498209904
				],
				[
					205.54746356894145,
					124.9635094593823
				],
				[
					209.05115788287435,
					121.45981514544928
				],
				[
					218.39416052063677,
					113.28465855536206
				],
				[
					223.06570088224487,
					107.44527214607888
				],
				[
					227.73724124385296,
					103.94157783214587
				],
				[
					232.40878160546106,
					96.93426728973373
				],
				[
					235.91247591939407,
					91.09488088045043
				],
				[
					239.41609214787331,
					84.08757033803829
				],
				[
					245.2554785571565,
					75.91241374795106
				],
				[
					249.9270189187646,
					63.06563871080175
				],
				[
					254.59855928037268,
					54.89048212071452
				],
				[
					256.93432946117673,
					49.051095711431344
				],
				[
					259.2700996419808,
					43.211631216694286
				],
				[
					261.6058698227848,
					38.54009085508619
				],
				[
					268.61318036519697,
					30.36493426499885
				],
				[
					270.948950546001,
					23.35762372258671
				],
				[
					272.1167965936762,
					18.686083360978614
				],
				[
					274.45256677448026,
					11.678772818566472
				],
				[
					276.7883369552843,
					8.17515659008734
				],
				[
					277.95626108841327,
					4.671540361608095
				],
				[
					277.95626108841327,
					3.5036162284792454
				],
				[
					276.7883369552843,
					3.5036162284792454
				],
				[
					275.6204909076092,
					5.839386409283293
				],
				[
					273.2847207268052,
					7.007310542412142
				],
				[
					269.78102641287217,
					9.343002637762424
				],
				[
					267.4452562320681,
					10.510926770891388
				],
				[
					265.10948605126396,
					11.678772818566472
				],
				[
					262.7737158704599,
					14.01454299937052
				],
				[
					261.6058698227848,
					15.182467132499482
				],
				[
					260.43802377510974,
					17.51823731330353
				],
				[
					258.1022535943057,
					17.51823731330353
				],
				[
					256.93432946117673,
					18.686083360978614
				],
				[
					255.76648341350165,
					19.854007494107577
				],
				[
					254.59855928037268,
					21.02185354178266
				],
				[
					252.26278909956864,
					22.189777674911625
				],
				[
					248.7591728710895,
					24.525547855715672
				],
				[
					247.59124873796054,
					25.693393903390756
				],
				[
					247.59124873796054,
					26.86131803651972
				],
				[
					249.9270189187646,
					24.525547855715672
				],
				[
					253.4307132326976,
					22.189777674911625
				],
				[
					256.93432946117673,
					18.686083360978614
				],
				[
					259.2700996419808,
					16.350313180174567
				],
				[
					260.43802377510974,
					15.182467132499482
				],
				[
					261.6058698227848,
					15.182467132499482
				],
				[
					262.7737158704599,
					14.01454299937052
				],
				[
					263.9416400035889,
					14.01454299937052
				],
				[
					266.2774101843929,
					11.678772818566472
				],
				[
					268.61318036519697,
					8.17515659008734
				],
				[
					270.948950546001,
					5.839386409283293
				],
				[
					272.1167965936762,
					5.839386409283293
				],
				[
					274.45256677448026,
					4.671540361608095
				],
				[
					275.6204909076092,
					3.5036162284792454
				],
				[
					276.7883369552843,
					1.1678460476750843
				],
				[
					279.12410713608836,
					0
				],
				[
					280.2920312692173,
					0
				],
				[
					282.62780145002137,
					0
				],
				[
					284.9635716308254,
					2.3357701808040474
				],
				[
					288.46718785930454,
					7.007310542412142
				],
				[
					290.8029580401086,
					9.343002637762424
				],
				[
					291.9708040877837,
					11.678772818566472
				],
				[
					293.13872822091264,
					12.846696951695435
				],
				[
					293.13872822091264,
					15.182467132499482
				],
				[
					295.4744984017167,
					17.51823731330353
				],
				[
					296.64234444939177,
					18.686083360978614
				],
				[
					300.1460387633248,
					22.189777674911625
				],
				[
					301.313884811,
					25.693393903390756
				],
				[
					301.313884811,
					26.86131803651972
				],
				[
					303.649654991804,
					29.197088217323767
				],
				[
					304.8175791249329,
					30.36493426499885
				],
				[
					305.9854251726081,
					31.532858398127814
				],
				[
					307.15334930573704,
					33.86862857893186
				],
				[
					307.15334930573704,
					35.036474626606946
				],
				[
					308.3211953534121,
					36.204320674282144
				],
				[
					310.65696553421617,
					38.54009085508619
				],
				[
					310.65696553421617,
					39.708014988215155
				],
				[
					311.82481158189125,
					40.87586103589024
				],
				[
					311.82481158189125,
					42.0437851690192
				],
				[
					312.9927357150202,
					42.0437851690192
				],
				[
					312.9927357150202,
					42.0437851690192
				]
			],
			"lastCommittedPoint": [
				312.9927357150202,
				42.0437851690192
			],
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "freedraw",
			"version": 156,
			"versionNonce": 2110160469,
			"isDeleted": false,
			"id": "nYExs3sLkUEFUTkmhj9z1",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 248.37693292911206,
			"y": 867.1021134908951,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 238.24808992929047,
			"height": 150.65690336277305,
			"seed": 1461869883,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					1.1678460476750843,
					0
				],
				[
					2.3356920953501685,
					4.671462276154216
				],
				[
					2.3356920953501685,
					10.510926770891274
				],
				[
					2.3356920953501685,
					17.518237313303416
				],
				[
					2.3356920953501685,
					22.18977767491151
				],
				[
					2.3356920953501685,
					26.86123995106584
				],
				[
					2.3356920953501685,
					31.532780312673935
				],
				[
					2.3356920953501685,
					36.20432067428203
				],
				[
					2.3356920953501685,
					43.21163121669417
				],
				[
					5.839386409283179,
					51.38686589223528
				],
				[
					5.839386409283179,
					59.56202248232262
				],
				[
					8.175078504633348,
					67.73717907240984
				],
				[
					8.175078504633348,
					72.40871943401794
				],
				[
					10.510926770891274,
					75.91241374795095
				],
				[
					12.846618866241442,
					81.75180015723413
				],
				[
					14.014464913916527,
					84.08757033803818
				],
				[
					17.518159227849537,
					92.26272692812552
				],
				[
					18.68600527552462,
					94.59849710892956
				],
				[
					21.021853541782548,
					100.43796160366662
				],
				[
					24.52554785571556,
					105.10942387982084
				],
				[
					26.861239951065727,
					109.78096424142893
				],
				[
					29.196932046415895,
					114.45250460303714
				],
				[
					30.364934264998737,
					116.78827478384119
				],
				[
					33.86847240802399,
					119.12404496464524
				],
				[
					35.03647462660683,
					121.45981514544928
				],
				[
					37.372166721957,
					123.79558532625333
				],
				[
					40.87586103589001,
					127.29920155473246
				],
				[
					46.71524744517342,
					131.97074191634056
				],
				[
					50.21894175910643,
					135.47443623027357
				],
				[
					51.38678780678151,
					137.81020641107762
				],
				[
					54.89048212071452,
					140.14597659188166
				],
				[
					58.394020263739776,
					142.4817467726857
				],
				[
					64.23356284393071,
					144.81751695348976
				],
				[
					68.90510320553881,
					147.1532871342938
				],
				[
					72.40864134856406,
					148.321133181969
				],
				[
					85.25541638571326,
					149.48905731509785
				],
				[
					93.43065106125437,
					150.65690336277305
				],
				[
					101.60572956588794,
					150.65690336277305
				],
				[
					110.94881028910413,
					150.65690336277305
				],
				[
					117.95619891697015,
					150.65690336277305
				],
				[
					124.96343137392842,
					150.65690336277305
				],
				[
					130.8028177832116,
					150.65690336277305
				],
				[
					138.9780524587527,
					149.48905731509785
				],
				[
					143.6495928203608,
					149.48905731509785
				],
				[
					149.48897922964397,
					145.98536300116484
				],
				[
					152.99267354357698,
					143.6495928203608
				],
				[
					161.16775204821056,
					140.14597659188166
				],
				[
					171.67883499000936,
					133.13866604946952
				],
				[
					176.35037535161746,
					127.29920155473246
				],
				[
					179.85391349464294,
					121.45981514544928
				],
				[
					184.52545385625103,
					116.78827478384119
				],
				[
					184.52545385625103,
					110.9488883745579
				],
				[
					188.02914817018404,
					105.10942387982084
				],
				[
					190.3648402655342,
					99.27003747053766
				],
				[
					195.0363806271423,
					91.09488088045043
				],
				[
					198.54007494107532,
					81.75180015723413
				],
				[
					200.87592320733324,
					71.24087338634286
				],
				[
					205.54730739803358,
					61.897792663126666
				],
				[
					206.71530961661642,
					56.05832816838961
				],
				[
					211.38684997822452,
					47.88317157830227
				],
				[
					211.38684997822452,
					44.379555349823136
				],
				[
					212.5546960258996,
					43.21163121669417
				],
				[
					213.7225420735747,
					38.54009085508608
				],
				[
					216.0583903398326,
					32.7007044458029
				],
				[
					217.2262363875077,
					28.029164084194804
				],
				[
					217.2262363875077,
					24.52554785571556
				],
				[
					218.39408243518278,
					19.854007494107464
				],
				[
					218.39408243518278,
					16.350313180174453
				],
				[
					219.56192848285787,
					12.846696951695321
				],
				[
					219.56192848285787,
					10.510926770891274
				],
				[
					219.56192848285787,
					9.34300263776231
				],
				[
					219.56192848285787,
					8.175156590087227
				],
				[
					219.56192848285787,
					7.007232456958263
				],
				[
					219.56192848285787,
					8.175156590087227
				],
				[
					218.39408243518278,
					9.34300263776231
				],
				[
					214.89038812124977,
					12.846696951695321
				],
				[
					212.5546960258996,
					15.182467132499369
				],
				[
					209.0510017119666,
					18.6860833609785
				],
				[
					206.71530961661642,
					21.02185354178266
				],
				[
					204.3794613503585,
					24.52554785571556
				],
				[
					203.2116153026834,
					26.86123995106584
				],
				[
					199.7079209887504,
					29.197010131869888
				],
				[
					198.54007494107532,
					30.36493426499885
				],
				[
					197.37222889340023,
					33.86855049347798
				],
				[
					195.0363806271423,
					36.20432067428203
				],
				[
					193.86853457946722,
					38.54009085508608
				],
				[
					193.86853457946722,
					36.20432067428203
				],
				[
					193.86853457946722,
					35.036474626606946
				],
				[
					196.20438284572515,
					31.532780312673935
				],
				[
					196.20438284572515,
					29.197010131869888
				],
				[
					197.37222889340023,
					28.029164084194804
				],
				[
					198.54007494107532,
					26.86123995106584
				],
				[
					199.7079209887504,
					25.693393903390756
				],
				[
					199.7079209887504,
					24.52554785571556
				],
				[
					200.87592320733324,
					22.18977767491151
				],
				[
					204.3794613503585,
					18.6860833609785
				],
				[
					204.3794613503585,
					16.350313180174453
				],
				[
					205.54730739803358,
					15.182467132499369
				],
				[
					206.71530961661642,
					14.014542999370406
				],
				[
					207.8831556642915,
					12.846696951695321
				],
				[
					210.21884775964168,
					10.510926770891274
				],
				[
					210.21884775964168,
					8.175156590087227
				],
				[
					211.38684997822452,
					8.175156590087227
				],
				[
					211.38684997822452,
					7.007232456958263
				],
				[
					212.5546960258996,
					7.007232456958263
				],
				[
					213.7225420735747,
					5.839386409283179
				],
				[
					213.7225420735747,
					4.671462276154216
				],
				[
					214.89038812124977,
					3.5036162284791317
				],
				[
					214.89038812124977,
					2.3356920953501685
				],
				[
					216.0583903398326,
					2.3356920953501685
				],
				[
					217.2262363875077,
					2.3356920953501685
				],
				[
					218.39408243518278,
					2.3356920953501685
				],
				[
					219.56192848285787,
					2.3356920953501685
				],
				[
					220.7299307014407,
					2.3356920953501685
				],
				[
					221.8977767491158,
					2.3356920953501685
				],
				[
					224.23346884446596,
					2.3356920953501685
				],
				[
					226.5693171107239,
					4.671462276154216
				],
				[
					227.73716315839897,
					5.839386409283179
				],
				[
					228.90500920607428,
					8.175156590087227
				],
				[
					228.90500920607428,
					9.34300263776231
				],
				[
					231.24085747233198,
					11.678772818566358
				],
				[
					231.24085747233198,
					15.182467132499369
				],
				[
					232.40870352000707,
					16.350313180174453
				],
				[
					233.57654956768238,
					21.02185354178266
				],
				[
					233.57654956768238,
					23.35762372258671
				],
				[
					233.57654956768238,
					24.52554785571556
				],
				[
					233.57654956768238,
					26.86123995106584
				],
				[
					234.74439561535746,
					28.029164084194804
				],
				[
					234.74439561535746,
					30.36493426499885
				],
				[
					234.74439561535746,
					31.532780312673935
				],
				[
					235.91239783394008,
					33.86855049347798
				],
				[
					235.91239783394008,
					36.20432067428203
				],
				[
					235.91239783394008,
					37.37224480741099
				],
				[
					235.91239783394008,
					38.54009085508608
				],
				[
					237.0802438816154,
					39.70801498821504
				],
				[
					237.0802438816154,
					40.875861035890125
				],
				[
					237.0802438816154,
					42.04378516901909
				],
				[
					238.24808992929047,
					43.21163121669417
				],
				[
					238.24808992929047,
					43.21163121669417
				]
			],
			"lastCommittedPoint": [
				238.24808992929047,
				43.21163121669417
			],
			"simulatePressure": true,
			"pressures": []
		},
		{
			"type": "rectangle",
			"version": 142,
			"versionNonce": 111607163,
			"isDeleted": false,
			"id": "RQcMpNSz1Wlx7ENEnAOzf",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 405.97587128434805,
			"y": 448.371228317748,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 450.72998046875,
			"height": 393.675537109375,
			"seed": 325727515,
			"groupIds": [],
			"roundness": {
				"type": 3
			},
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false
		},
		{
			"type": "text",
			"version": 65,
			"versionNonce": 1500375989,
			"isDeleted": false,
			"id": "HqQ8PDYt",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": -255.1511431182725,
			"y": 1046.9086060489667,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 195.05990600585938,
			"height": 25,
			"seed": 308750171,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "$sql = \"SELECT ...\"",
			"rawText": "$sql = \"SELECT ...\"",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$sql = \"SELECT ...\"",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"type": "text",
			"version": 174,
			"versionNonce": 763336219,
			"isDeleted": false,
			"id": "EshXE5xW",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"angle": 0,
			"x": 182.81847708910988,
			"y": 1033.7366420253695,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"width": 389.1397705078125,
			"height": 25,
			"seed": 161301883,
			"groupIds": [],
			"roundness": null,
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"fontSize": 20,
			"fontFamily": 1,
			"text": "$sql = \"INSERT INTO reservations ...\"",
			"rawText": "$sql = \"INSERT INTO reservations ...\"",
			"textAlign": "left",
			"verticalAlign": "top",
			"containerId": null,
			"originalText": "$sql = \"INSERT INTO reservations ...\"",
			"lineHeight": 1.25,
			"baseline": 17
		},
		{
			"id": "Tq4ECbjK",
			"type": "text",
			"x": 439.4560787722644,
			"y": 483.94378633569744,
			"width": 341.43975830078125,
			"height": 50,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 208130261,
			"version": 90,
			"versionNonce": 478194965,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460113,
			"link": null,
			"locked": false,
			"text": "// Save info into variables, before\nINSERT INTO",
			"rawText": "// Save info into variables, before\nINSERT INTO",
			"fontSize": 20,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 42,
			"containerId": null,
			"originalText": "// Save info into variables, before\nINSERT INTO",
			"lineHeight": 1.25
		},
		{
			"id": "1gV30wVk",
			"type": "text",
			"x": 653.7405539984156,
			"y": 325.39247183117453,
			"width": 605.3596801757812,
			"height": 25,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1155808667,
			"version": 86,
			"versionNonce": 1794906811,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "JSON in MariaDb -> Save in a variable as a LONG VARCHAR",
			"rawText": "JSON in MariaDb -> Save in a variable as a LONG VARCHAR",
			"fontSize": 20,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 17,
			"containerId": null,
			"originalText": "JSON in MariaDb -> Save in a variable as a LONG VARCHAR",
			"lineHeight": 1.25
		},
		{
			"id": "jH30e78m",
			"type": "text",
			"x": 434.5617211920646,
			"y": 550.0175114060524,
			"width": 278.43988037109375,
			"height": 25,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 538154203,
			"version": 181,
			"versionNonce": 1718895221,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "// $sql = \"INSERT INTO...\"",
			"rawText": "// $sql = \"INSERT INTO...\"",
			"fontSize": 20,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 17,
			"containerId": null,
			"originalText": "// $sql = \"INSERT INTO...\"",
			"lineHeight": 1.25
		},
		{
			"id": "aTuZEtlw",
			"type": "text",
			"x": -209.97407685609943,
			"y": 982.6593187288145,
			"width": 78.37196350097656,
			"height": 35,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 379840405,
			"version": 29,
			"versionNonce": 1679484923,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "POST",
			"rawText": "POST",
			"fontSize": 28,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 25,
			"containerId": null,
			"originalText": "POST",
			"lineHeight": 1.25
		},
		{
			"id": "HgO63MI0",
			"type": "text",
			"x": 318.1661585628394,
			"y": 970.3404587372978,
			"width": 78.37196350097656,
			"height": 35,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 822689237,
			"version": 93,
			"versionNonce": 761522485,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "POST",
			"rawText": "POST",
			"fontSize": 28,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 25,
			"containerId": null,
			"originalText": "POST",
			"lineHeight": 1.25
		},
		{
			"id": "G7_1HmW0olfHRsOqVkz6K",
			"type": "arrow",
			"x": 928.6003054318704,
			"y": 649.7873108570128,
			"width": 173.8857397442215,
			"height": 7.420264223015124,
			"angle": 0,
			"strokeColor": "#2b8a3e",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 2083959195,
			"version": 97,
			"versionNonce": 974270619,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					173.8857397442215,
					7.420264223015124
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": {
				"elementId": "YZeTBBvY",
				"focus": -0.008060496859689958,
				"gap": 20.4475333824862
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "YZeTBBvY",
			"type": "text",
			"x": 1122.9335785585781,
			"y": 571.9713166374859,
			"width": 503.90625,
			"height": 192,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 588708539,
			"version": 376,
			"versionNonce": 1272642197,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "G7_1HmW0olfHRsOqVkz6K",
					"type": "arrow"
				}
			],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "$reservation_number (GENERATE IT)\n$customer_id = FROM the $_SESSION variable\n$car_id = $_POST['car_id'];\n$date_in = $_POST['date_in'];\n$date_out = $_POST['date_out'];\n$extras_array = $_POST['extras'];\n\n$extras_json = json_encode ($extras-array);",
			"rawText": "$reservation_number (GENERATE IT)\n$customer_id = FROM the $_SESSION variable\n$car_id = $_POST['car_id'];\n$date_in = $_POST['date_in'];\n$date_out = $_POST['date_out'];\n$extras_array = $_POST['extras'];\n\n$extras_json = json_encode ($extras-array);",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 187,
			"containerId": null,
			"originalText": "$reservation_number (GENERATE IT)\n$customer_id = FROM the $_SESSION variable\n$car_id = $_POST['car_id'];\n$date_in = $_POST['date_in'];\n$date_out = $_POST['date_out'];\n$extras_array = $_POST['extras'];\n\n$extras_json = json_encode ($extras-array);",
			"lineHeight": 1.2
		},
		{
			"id": "Z4-OgYAWLXODtUZ7vwIRX",
			"type": "arrow",
			"x": 899.0465726579447,
			"y": 789.1855335394681,
			"width": 193.65513462920683,
			"height": 197.13393549162038,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 42356181,
			"version": 297,
			"versionNonce": 539549685,
			"isDeleted": false,
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					143.7918829177289,
					74.21516787793735
				],
				[
					193.65513462920683,
					197.13393549162038
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "VVFp84cf",
			"type": "text",
			"x": 836.4276144077623,
			"y": 1016.4693349466431,
			"width": 1160.15625,
			"height": 48,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1541649115,
			"version": 286,
			"versionNonce": 1884494165,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)\nVALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json');",
			"rawText": "INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)\nVALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json');",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 43,
			"containerId": null,
			"originalText": "INSERT INTO reservations (reservation_number, customer_id, car_id, date_in, date_out, extras)\nVALUES ('$reservation_number', '$customer_id', '$car_id', '$date_in', '$date_out', '$extras_json');",
			"lineHeight": 1.2
		},
		{
			"id": "LTkD87CbRcMUQuUch1w-p",
			"type": "line",
			"x": 1124.011225178438,
			"y": 771.791374162618,
			"width": 510.22895933970494,
			"height": 1.1596519757320038,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1896335477,
			"version": 116,
			"versionNonce": 1157993083,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					510.22895933970494,
					1.1596519757320038
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": null
		},
		{
			"id": "te0FkBf6SHy-aGwpwj0Mr",
			"type": "arrow",
			"x": 1672.2482992639866,
			"y": 759.2614152774277,
			"width": 132.2979182875465,
			"height": 48.56794083737407,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1076477333,
			"version": 79,
			"versionNonce": 632235701,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					132.2979182875465,
					-48.56794083737407
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": {
				"focus": 0.4234049628968585,
				"gap": 14.610266527090857,
				"elementId": "NYwqXhYh"
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "NYwqXhYh",
			"type": "text",
			"x": 1818.350964534895,
			"y": 658.9375243427845,
			"width": 269.53125,
			"height": 48,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1020732603,
			"version": 128,
			"versionNonce": 759401243,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"text": "from ARRAY to json\n(SQL can't save arrays)",
			"rawText": "from ARRAY to json\n(SQL can't save arrays)",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "center",
			"verticalAlign": "top",
			"baseline": 43,
			"containerId": null,
			"originalText": "from ARRAY to json\n(SQL can't save arrays)",
			"lineHeight": 1.2
		},
		{
			"id": "aMPmBsLS-9i4XTOtOxZpG",
			"type": "arrow",
			"x": 1717.8466745390556,
			"y": 781.3080716055435,
			"width": 545.5654439758559,
			"height": 266.3098711873231,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 311757083,
			"version": 170,
			"versionNonce": 1659013141,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					545.5654439758559,
					177.53995534167984
				],
				[
					309.770202379912,
					266.3098711873231
				]
			],
			"lastCommittedPoint": [
				309.770202379912,
				266.3098711873231
			],
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "UqEUOqzf8iGtT8Cd_6snF",
			"type": "line",
			"x": 1814.7592056856968,
			"y": 1066.0672896501972,
			"width": 163.02844423149418,
			"height": 1.6551141984937203,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 2037525147,
			"version": 63,
			"versionNonce": 410611643,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					163.02844423149418,
					1.6551141984937203
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": null
		},
		{
			"id": "neV0r74m",
			"type": "text",
			"x": 1815.6615300560447,
			"y": 513.1682705873274,
			"width": 480.46875,
			"height": 72,
			"angle": 6.281060493002873,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 483015477,
			"version": 145,
			"versionNonce": 1508031861,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"text": "$extras_json\n\n$extras_array = json_decode($extras_json)",
			"rawText": "$extras_json\n\n$extras_array = json_decode($extras_json)",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 67,
			"containerId": null,
			"originalText": "$extras_json\n\n$extras_array = json_decode($extras_json)",
			"lineHeight": 1.2
		},
		{
			"id": "UUNKN0M9cHdc3l-zbRMHC",
			"type": "arrow",
			"x": 2105.718507683414,
			"y": 536.4720440478355,
			"width": 197.6679924973564,
			"height": 109.38779152937047,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1402179739,
			"version": 69,
			"versionNonce": 952746075,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					197.6679924973564,
					-109.38779152937047
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": {
				"elementId": "1sEnK5kc",
				"focus": 0.45902760423695094,
				"gap": 12.393286399572503
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "1sEnK5kc",
			"type": "text",
			"x": 2300.3642035407656,
			"y": 390.69096611889256,
			"width": 210.9375,
			"height": 24,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 176393499,
			"version": 243,
			"versionNonce": 1643464405,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "te0FkBf6SHy-aGwpwj0Mr",
					"type": "arrow"
				},
				{
					"id": "UUNKN0M9cHdc3l-zbRMHC",
					"type": "arrow"
				}
			],
			"updated": 1683136460115,
			"link": null,
			"locked": false,
			"text": "from json to ARRAY",
			"rawText": "from json to ARRAY",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "center",
			"verticalAlign": "top",
			"baseline": 19,
			"containerId": null,
			"originalText": "from json to ARRAY",
			"lineHeight": 1.2
		},
		{
			"id": "nDIl9vLl",
			"type": "text",
			"x": 222.2592658202559,
			"y": -514.1611140280706,
			"width": 1880.482177734375,
			"height": 206.02044164320873,
			"angle": 0,
			"strokeColor": "#862e9c",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1596714619,
			"version": 232,
			"versionNonce": 126505371,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683137271908,
			"link": null,
			"locked": false,
			"text": "APUNTES SQL + JSON",
			"rawText": "APUNTES SQL + JSON",
			"fontSize": 164.81635331456698,
			"fontFamily": 1,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 144,
			"containerId": null,
			"originalText": "APUNTES SQL + JSON",
			"lineHeight": 1.25
		},
		{
			"id": "ePCHI0yi",
			"type": "text",
			"x": 1669.2527939011031,
			"y": -27.158776934594894,
			"width": 375,
			"height": 312,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1639163291,
			"version": 227,
			"versionNonce": 178409333,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "f-bRLg8oEH3dPahlKVhD8",
					"type": "arrow"
				}
			],
			"updated": 1683136668744,
			"link": null,
			"locked": false,
			"text": "[ \n    {\n        \"name\" : \"Google\",\n        \"numberEmployees\" : 354,\n        \"ceo\" : \"John Smith\"\n    },\n\n    {\n        \"name\" : \"Amazon\",\n        \"numberEmployees\" : 512,\n        \"ceo\" : \"Jeff Smith\"\n    }\n]",
			"rawText": "[ \n    {\n        \"name\" : \"Google\",\n        \"numberEmployees\" : 354,\n        \"ceo\" : \"John Smith\"\n    },\n\n    {\n        \"name\" : \"Amazon\",\n        \"numberEmployees\" : 512,\n        \"ceo\" : \"Jeff Smith\"\n    }\n]",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 307,
			"containerId": null,
			"originalText": "[ \n    {\n        \"name\" : \"Google\",\n        \"numberEmployees\" : 354,\n        \"ceo\" : \"John Smith\"\n    },\n\n    {\n        \"name\" : \"Amazon\",\n        \"numberEmployees\" : 512,\n        \"ceo\" : \"Jeff Smith\"\n    }\n]",
			"lineHeight": 1.2
		},
		{
			"id": "f-bRLg8oEH3dPahlKVhD8",
			"type": "arrow",
			"x": 1921.8667430368876,
			"y": -45.21785963300408,
			"width": 579.6730804443357,
			"height": 163.17565917968744,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1164455509,
			"version": 118,
			"versionNonce": 1785576891,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136668744,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					311.51718139648415,
					-160.89347839355463
				],
				[
					579.6730804443357,
					2.2821807861328125
				]
			],
			"lastCommittedPoint": [
				579.6730804443357,
				2.2821807861328125
			],
			"startBinding": {
				"elementId": "ePCHI0yi",
				"focus": -0.5554043703433835,
				"gap": 18.059082698409213
			},
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "a1PaF707",
			"type": "text",
			"x": 2406.980797498597,
			"y": 43.06310298316219,
			"width": 503.90625,
			"height": 48,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 2100773243,
			"version": 145,
			"versionNonce": 1609796437,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "e8Khg6w2yTdMu0-3uBDeM",
					"type": "arrow"
				},
				{
					"id": "KcqlgxRnkujsn4qko7UnO",
					"type": "arrow"
				}
			],
			"updated": 1683137218811,
			"link": null,
			"locked": false,
			"text": "SELECT JSON_EXTRACT(companies, '$[0].name')\nFROM info;",
			"rawText": "SELECT JSON_EXTRACT(companies, '$[0].name')\nFROM info;",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 43,
			"containerId": null,
			"originalText": "SELECT JSON_EXTRACT(companies, '$[0].name')\nFROM info;",
			"lineHeight": 1.2
		},
		{
			"id": "mNMefL72",
			"type": "text",
			"x": 2421.157131655307,
			"y": -20.879562745238548,
			"width": 49.21875,
			"height": 33.6,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 460458075,
			"version": 86,
			"versionNonce": 651407803,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136926912,
			"link": null,
			"locked": false,
			"text": "SQL",
			"rawText": "SQL",
			"fontSize": 28,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 26,
			"containerId": null,
			"originalText": "SQL",
			"lineHeight": 1.2
		},
		{
			"id": "4UyNR4gqD310kQum5wSPN",
			"type": "line",
			"x": 2401.2177132935617,
			"y": 27.60951801401803,
			"width": 99.5029296875,
			"height": 1.8257446289061932,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 808516533,
			"version": 83,
			"versionNonce": 1681229339,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136898928,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					99.5029296875,
					-1.8257446289061932
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": null
		},
		{
			"id": "wIt4g0te",
			"type": "text",
			"x": 2796.4907845826237,
			"y": -70.50920146840375,
			"width": 457.03125,
			"height": 24,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1933952661,
			"version": 58,
			"versionNonce": 1819367605,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "KcqlgxRnkujsn4qko7UnO",
					"type": "arrow"
				}
			],
			"updated": 1683137218811,
			"link": null,
			"locked": false,
			"text": "$ = root (principio del documento JSON)",
			"rawText": "$ = root (principio del documento JSON)",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 19,
			"containerId": null,
			"originalText": "$ = root (principio del documento JSON)",
			"lineHeight": 1.2
		},
		{
			"id": "tzxag6xQ",
			"type": "text",
			"x": 2417.3444808625677,
			"y": 115.67516245294615,
			"width": 32.8125,
			"height": 33.6,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 2057244085,
			"version": 165,
			"versionNonce": 1290376219,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136969338,
			"link": null,
			"locked": false,
			"text": "JS",
			"rawText": "JS",
			"fontSize": 28,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 26,
			"containerId": null,
			"originalText": "JS",
			"lineHeight": 1.2
		},
		{
			"id": "ggNwlqIbi307JNkhVkZic",
			"type": "line",
			"x": 2389.4578363691594,
			"y": 155.4114032822855,
			"width": 99.5029296875,
			"height": 1.8257446289061932,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1232392309,
			"version": 182,
			"versionNonce": 1364614491,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136982276,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					99.5029296875,
					-1.8257446289061932
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": null
		},
		{
			"id": "RUE4cMLs",
			"type": "text",
			"x": 2410.3636925755727,
			"y": 175.08631465308395,
			"width": 503.90625,
			"height": 48,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1363717051,
			"version": 323,
			"versionNonce": 837763995,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "znMa7JnGvohTx4sJ8e79R",
					"type": "arrow"
				}
			],
			"updated": 1683137075449,
			"link": null,
			"locked": false,
			"text": "let companies = JSON.parse(companies_json);\nconsole.log(companies[0].name);",
			"rawText": "let companies = JSON.parse(companies_json);\nconsole.log(companies[0].name);",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 43,
			"containerId": null,
			"originalText": "let companies = JSON.parse(companies_json);\nconsole.log(companies[0].name);",
			"lineHeight": 1.2
		},
		{
			"id": "tfMbc1Xd",
			"type": "text",
			"x": 2410.618085406153,
			"y": 241.55528940607115,
			"width": 49.21875,
			"height": 33.6,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 955422933,
			"version": 224,
			"versionNonce": 2115833723,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136980207,
			"link": null,
			"locked": false,
			"text": "PHP",
			"rawText": "PHP",
			"fontSize": 28,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 26,
			"containerId": null,
			"originalText": "PHP",
			"lineHeight": 1.2
		},
		{
			"id": "w2Q_05LOA0j31NBa-_x8n",
			"type": "line",
			"x": 2386.5750495681727,
			"y": 278.4087434344237,
			"width": 99.5029296875,
			"height": 1.8257446289061932,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 803626491,
			"version": 222,
			"versionNonce": 458693973,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683136983156,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					99.5029296875,
					-1.8257446289061932
				]
			],
			"lastCommittedPoint": null,
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": null
		},
		{
			"id": "k2ZZqBtY",
			"type": "text",
			"x": 2409.402742226066,
			"y": 297.1227044557155,
			"width": 480.46875,
			"height": 48,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1119782811,
			"version": 438,
			"versionNonce": 243712731,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "JvroJ5jn0IKcUlD3fAXIO",
					"type": "arrow"
				}
			],
			"updated": 1683137079961,
			"link": null,
			"locked": false,
			"text": "$companies = json_decode(companies_json);\necho $companies[0]['name'];",
			"rawText": "$companies = json_decode(companies_json);\necho $companies[0]['name'];",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 43,
			"containerId": null,
			"originalText": "$companies = json_decode(companies_json);\necho $companies[0]['name'];",
			"lineHeight": 1.2
		},
		{
			"id": "M82reCfw",
			"type": "text",
			"x": 3000.5655567950425,
			"y": 42.165155667597844,
			"width": 64.4921875,
			"height": 23,
			"angle": 0,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1178994907,
			"version": 79,
			"versionNonce": 70524021,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "e8Khg6w2yTdMu0-3uBDeM",
					"type": "arrow"
				}
			],
			"updated": 1683137082507,
			"link": null,
			"locked": false,
			"text": "Google",
			"rawText": "Google",
			"fontSize": 20,
			"fontFamily": 2,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 18,
			"containerId": null,
			"originalText": "Google",
			"lineHeight": 1.15
		},
		{
			"id": "LMFu4Sdh",
			"type": "text",
			"x": 3006.3308734068855,
			"y": 180.5371874315781,
			"width": 64.4921875,
			"height": 23,
			"angle": 0,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1790355419,
			"version": 128,
			"versionNonce": 126093429,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "znMa7JnGvohTx4sJ8e79R",
					"type": "arrow"
				}
			],
			"updated": 1683137083873,
			"link": null,
			"locked": false,
			"text": "Google",
			"rawText": "Google",
			"fontSize": 20,
			"fontFamily": 2,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 18,
			"containerId": null,
			"originalText": "Google",
			"lineHeight": 1.15
		},
		{
			"id": "oDYhybRj",
			"type": "text",
			"x": 3013.0573973583655,
			"y": 298.7299364550157,
			"width": 64.4921875,
			"height": 23,
			"angle": 0,
			"strokeColor": "#087f5b",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1528779707,
			"version": 172,
			"versionNonce": 167064731,
			"isDeleted": false,
			"boundElements": [
				{
					"id": "JvroJ5jn0IKcUlD3fAXIO",
					"type": "arrow"
				}
			],
			"updated": 1683137085173,
			"link": null,
			"locked": false,
			"text": "Google",
			"rawText": "Google",
			"fontSize": 20,
			"fontFamily": 2,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 18,
			"containerId": null,
			"originalText": "Google",
			"lineHeight": 1.15
		},
		{
			"id": "e8Khg6w2yTdMu0-3uBDeM",
			"type": "arrow",
			"x": 2921.770262284352,
			"y": 53.83849276858626,
			"width": 69.18604800575667,
			"height": 2.516629394120585,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1365004251,
			"version": 73,
			"versionNonce": 1914946581,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683137099573,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					69.18604800575667,
					2.516629394120585
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "a1PaF707",
				"focus": -0.7124528592672734,
				"gap": 10.883214785755172
			},
			"endBinding": {
				"elementId": "M82reCfw",
				"focus": -0.3323968017328817,
				"gap": 9.609246504933708
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "znMa7JnGvohTx4sJ8e79R",
			"type": "arrow",
			"x": 2927.535771638793,
			"y": 197.16073243291868,
			"width": 69.18598375822421,
			"height": 6.357641883634216,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1642655509,
			"version": 67,
			"versionNonce": 1936188085,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683137091733,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					69.18598375822421,
					-6.357641883634216
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "RUE4cMLs",
				"focus": 0.5088286575115243,
				"gap": 13.26582906322028
			},
			"endBinding": {
				"elementId": "LMFu4Sdh",
				"focus": 0.35125506569350273,
				"gap": 9.609118009868325
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "JvroJ5jn0IKcUlD3fAXIO",
			"type": "arrow",
			"x": 2896.7864526626418,
			"y": 307.0559430825151,
			"width": 103.77903988486833,
			"height": 2.8186751366970952,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 390158555,
			"version": 58,
			"versionNonce": 1433621845,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683137088917,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					103.77903988486833,
					2.8186751366970952
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "k2ZZqBtY",
				"focus": -0.7005562406499369,
				"gap": 6.914960436575711
			},
			"endBinding": {
				"elementId": "oDYhybRj",
				"focus": -0.06947271652088945,
				"gap": 12.49190481085543
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "KcqlgxRnkujsn4qko7UnO",
			"type": "arrow",
			"x": 2794.4976287337126,
			"y": 30.047812785101,
			"width": 53.836067875425215,
			"height": 67.29504734935344,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1704753525,
			"version": 27,
			"versionNonce": 1935491195,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683137218811,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					53.836067875425215,
					-67.29504734935344
				]
			],
			"lastCommittedPoint": null,
			"startBinding": {
				"elementId": "a1PaF707",
				"focus": 0.3907439879126991,
				"gap": 13.01529019806119
			},
			"endBinding": {
				"elementId": "wIt4g0te",
				"focus": 0.6705277168869097,
				"gap": 9.261966904151308
			},
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "CL8gdyWI",
			"type": "text",
			"x": 1728.4907906495187,
			"y": -66.51370316609379,
			"width": 127.572265625,
			"height": 32.199999999999996,
			"angle": 0,
			"strokeColor": "#e67700",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 2,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 915307029,
			"version": 56,
			"versionNonce": 538509915,
			"isDeleted": false,
			"boundElements": null,
			"updated": 1683137243375,
			"link": null,
			"locked": false,
			"text": "JSON File",
			"rawText": "JSON File",
			"fontSize": 28,
			"fontFamily": 2,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 26,
			"containerId": null,
			"originalText": "JSON File",
			"lineHeight": 1.15
		},
		{
			"id": "GLYJ6dCVcAl03e_58ZIxz",
			"type": "arrow",
			"x": -409.99441903584153,
			"y": 917.741728061062,
			"width": 339.6430985952283,
			"height": 309.40789170052597,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": {
				"type": 2
			},
			"seed": 1511362811,
			"version": 265,
			"versionNonce": 465505115,
			"isDeleted": true,
			"boundElements": [],
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"points": [
				[
					0,
					0
				],
				[
					19.149016028527853,
					309.40789170052597
				],
				[
					183.42740250798994,
					270.1019812287767
				],
				[
					339.6430985952283,
					233.8196386160431
				],
				[
					302.35294495286604,
					254.98434408889318
				]
			],
			"lastCommittedPoint": [
				302.35294495286604,
				254.98434408889318
			],
			"startBinding": null,
			"endBinding": null,
			"startArrowhead": null,
			"endArrowhead": "arrow"
		},
		{
			"id": "mOSjZ6z3",
			"type": "text",
			"x": -231.5670165278516,
			"y": 1175.3437092898387,
			"width": 10,
			"height": 25,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 798177013,
			"version": 4,
			"versionNonce": 1275997141,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "",
			"rawText": "",
			"fontSize": 20,
			"fontFamily": 1,
			"textAlign": "center",
			"verticalAlign": "middle",
			"baseline": 17,
			"containerId": "GLYJ6dCVcAl03e_58ZIxz",
			"originalText": "",
			"lineHeight": 1.25
		},
		{
			"id": "Y9opYWSi",
			"type": "text",
			"x": 1171.921787978708,
			"y": 466.7162748281346,
			"width": 11.71875,
			"height": 24,
			"angle": 0,
			"strokeColor": "#000000",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1967669371,
			"version": 3,
			"versionNonce": 794256699,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "",
			"rawText": "",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "left",
			"verticalAlign": "top",
			"baseline": 19,
			"containerId": null,
			"originalText": "",
			"lineHeight": 1.2
		},
		{
			"id": "YDeK8JWo",
			"type": "text",
			"x": 1067.1289464912284,
			"y": 743.5567892291086,
			"width": 11.71875,
			"height": 24,
			"angle": 0,
			"strokeColor": "#c92a2a",
			"backgroundColor": "transparent",
			"fillStyle": "hachure",
			"strokeWidth": 1,
			"strokeStyle": "solid",
			"roughness": 1,
			"opacity": 100,
			"groupIds": [],
			"roundness": null,
			"seed": 1945674491,
			"version": 4,
			"versionNonce": 2068645339,
			"isDeleted": true,
			"boundElements": null,
			"updated": 1683136460114,
			"link": null,
			"locked": false,
			"text": "",
			"rawText": "",
			"fontSize": 20,
			"fontFamily": 3,
			"textAlign": "center",
			"verticalAlign": "middle",
			"baseline": 19,
			"containerId": "Z4-OgYAWLXODtUZ7vwIRX",
			"originalText": "",
			"lineHeight": 1.2
		}
	],
	"appState": {
		"theme": "light",
		"viewBackgroundColor": "#ffffff",
		"currentItemStrokeColor": "#e67700",
		"currentItemBackgroundColor": "transparent",
		"currentItemFillStyle": "hachure",
		"currentItemStrokeWidth": 2,
		"currentItemStrokeStyle": "solid",
		"currentItemRoughness": 1,
		"currentItemOpacity": 100,
		"currentItemFontFamily": 2,
		"currentItemFontSize": 28,
		"currentItemTextAlign": "left",
		"currentItemStartArrowhead": null,
		"currentItemEndArrowhead": "arrow",
		"scrollX": 1566.128010725033,
		"scrollY": 1375.1493909211113,
		"zoom": {
			"value": 0.25
		},
		"currentItemRoundness": "round",
		"gridSize": null,
		"colorPalette": {},
		"currentStrokeOptions": null,
		"previousGridSize": null
	},
	"files": {}
}
```
%%